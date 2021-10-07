/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100;

import uk.ac.rgu.cm2100.devices.Colourable;
import uk.ac.rgu.cm2100.devices.Device;
import uk.ac.rgu.cm2100.devices.Dimmable;
import uk.ac.rgu.cm2100.devices.Light;
import uk.ac.rgu.cm2100.devices.SmartPlug;
import uk.ac.rgu.cm2100.devices.Switchable;

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
    public static void main(String[] args) {

        Device[] devices = new Device[2];
        
        devices[0] = new Light("hall");
        devices[1] = new SmartPlug("kettle");
        
        for(Device d : devices){
            System.out.println(d);
        }
        
        
        Switchable s = new Light("lounge");
        
        Light l = new Light("kitchen");
        
        Colourable c = new Light("bedroom");
        
    
     
        
        Dimmable d = new Light("x");
  
        
        
    }

}
