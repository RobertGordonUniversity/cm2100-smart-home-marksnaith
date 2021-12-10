/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100.commands;

/**
 * Interface to model a command - something we can do with the smart home
 * @author mark
 */
public interface Command {
    public void execute();
    
    default void addParameters(Object... parameters){
        //do nothing
    }
}
