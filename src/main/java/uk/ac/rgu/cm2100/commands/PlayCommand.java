/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100.commands;

import uk.ac.rgu.cm2100.devices.functionality.Playable;

/**
 *
 * @author mark
 */
public class PlayCommand<T> implements Command{
    
    private Playable<T> device;
    private T media;
    
    public PlayCommand(Playable device){
        this.device = device;
    }
    
    public void execute(){
        this.device.play(media);
    }
    
    public void addParameters(Object... parameters){
        this.media = (T)parameters[0];
    }
    
}
