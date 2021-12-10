/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100.sensors;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mark
 */
public abstract class Sensor {
    
    private final List<SensorEventHandler> eventHandlers;
    private final String name;
    
    public Sensor(String name){
        this.eventHandlers = new ArrayList<>();
        this.name = name;
    }
    
    /**
     * Adds the given SensorEventHandler to this sensor
     * @param handler 
     */
    public final void addEventHandler(SensorEventHandler handler){
        this.eventHandlers.add(handler);
    }
    
    /**
     * Notifies event handlers of an event in the sensor
     */
    protected final void notifyHandlers(){
        this.eventHandlers.forEach((e) -> e.receieveEvent(this));
    }
    
    /**
     * Gets the name of this sensor
     * @return 
     */
    public final String getName(){
        return this.name;
    }
    
}
