/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100;

import uk.ac.rgu.cm2100.devices.Light;
import uk.ac.rgu.cm2100.sensors.LightSensor;
import uk.ac.rgu.cm2100.sensors.SensorStrategy;

/**
 * Main class for running and testing the SmartHome application
 *
 * @author Mark Snaith
 */
public class MainApp {

    /**
     * Main method for running the SmartHome application
     *
     * @param args
     */
    public static void main(String[] args){
        var home = new Home();       
        var light = new Light("hall");
        
        home.addCommand("hall_light_on", light::switchOn, light);
        home.addCommand("hall_light_off", light::switchOff, light);

        var lightSensor = new LightSensor("hall_sensor");

        lightSensor.addEventHandler(home); 
        
        SensorStrategy strategy = (h, s) -> {
            LightSensor sensor = (LightSensor)s;
            
            if(sensor.getLightLevel() <= 5){
                home.executeCommand("hall_light_on");
            }else{
                home.executeCommand("hall_light_off");
            }
        };
        
        lightSensor.addEventHandler((s) -> System.out.println("Handling event in lambda"));
        
        home.addSensorStrategy("hall_sensor", strategy);      
             
        lightSensor.setLightLevel(6);
        
        

    }

}
