/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100.commands;

import uk.ac.rgu.cm2100.Colourable;

/**
 *
 * @author mark
 */
public class SetColourCommand implements Command {
    
    private int r, g, b;
    private Colourable device;
    
    public SetColourCommand(Colourable device){
        this.device = device;
    }
    
    public void execute(){
        device.setColour(this.r, this.g, this.b);
    }
    
    @Override
    public void addParameters(String... parameters){
        this.r = Integer.valueOf(parameters[0]);
        this.g = Integer.valueOf(parameters[1]);
        this.b = Integer.valueOf(parameters[2]);
    }
    
}
