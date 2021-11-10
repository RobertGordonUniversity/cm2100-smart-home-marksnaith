/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100.devices.functionality;

/**
 * Interface to model Playable devices - stereos, TV sticks etc.
 * @author mark
 * @param <T>
 */
public interface Playable<T> {
    public void play(T media);
}
