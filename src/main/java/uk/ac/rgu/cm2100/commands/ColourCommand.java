/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100.commands;

import java.util.HashSet;
import uk.ac.rgu.cm2100.devices.Colourable;

/**
 *
 * @author mark
 */
public class ColourCommand implements Command{
    
    private final Colourable device;
    private int r, g, b;
    
    public ColourCommand(Colourable device){
        this.device = device;
    }

    @Override
    public void execute() {
        this.device.setColour(r, g, b);
        }

    @Override
    public void addParameters(Object... parameters) {
       this.r = (int)parameters[0];
       this.g = (int)parameters[1];
       this.b = (int)parameters[2];
       
    }


}
