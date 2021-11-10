/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100;

import java.io.IOException;
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

        var lightSensor = new LightSensor("hall_sensor");

        SensorStrategy strategy = (h, s) -> {

        };
        
        home.addSensorStrategy("hall_sensor", strategy);      
        //lightSensor.addEventHandler(home);      
        lightSensor.setLightLevel(5);
        
        

    }

}
