/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100;

import java.io.IOException;
import uk.ac.rgu.cm2100.devices.Light;
import uk.ac.rgu.cm2100.devices.Stereo;
import uk.ac.rgu.cm2100.devices.TVStick;

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
    public static void main(String[] args) throws IOException {
        var home = new Home();
        var light = new Light("hall");
        var light2 = new Light("living_room");

       
        var tvStick = new TVStick("amazon");
        var stereo = new Stereo("sonos");
        
        home.addDevice(tvStick);
        home.addDevice(stereo);
        home.addDevice(light2);
        home.addDevice(light);
        
        
        
        //home.getDevicesByName().forEach(System.out::println);
        
        home.devices.forEach(System.out::println);
        System.out.println();
        
        home.getDevicesByType().forEach(System.out::println);
        
        
//        home.addCommand("switch_on_light", light::switchOn, light);
//        
//        home.executeCommand("switch_on_light");
        
        

    }

}
