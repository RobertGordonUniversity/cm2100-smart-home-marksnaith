/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100;

/**
 *
 * @author mark
 */
public class TooManyCommandsException extends Exception {
    
    public TooManyCommandsException(String message){
        super(message);
    }
    
}
