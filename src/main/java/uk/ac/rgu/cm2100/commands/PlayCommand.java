/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100.commands;

import uk.ac.rgu.cm2100.Playable;

/**
 *
 * @author mark
 */
public class PlayCommand implements Command {
    
    private Playable device;
    private String media;
    
    public PlayCommand(Playable device){
        this.device = device;
    }
    
    @Override
    public void execute(){
        this.device.play(this.media);
    }
    
    @Override
    public void addParameters(String... parameters){
        this.media = parameters[0];
    }
    
    
    
}
