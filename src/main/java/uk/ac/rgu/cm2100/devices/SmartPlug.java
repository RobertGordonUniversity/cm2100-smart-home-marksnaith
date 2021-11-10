/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100.devices;

import uk.ac.rgu.cm2100.devices.functionality.Switchable;

/**
 * Class representing a smart plug in the smart home
 * @author mark
 */
public class SmartPlug extends Device implements Switchable{

    public SmartPlug(String name){
        super(name);
    }

    @Override
    public void switchOn() {
        System.out.println("plug on"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void switchOff() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
