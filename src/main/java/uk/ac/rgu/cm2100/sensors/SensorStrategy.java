/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100.sensors;

import uk.ac.rgu.cm2100.Home;

/**
 *
 * @author mark
 */
public interface SensorStrategy {
    public void perform(Home home, Sensor sensor);
}
