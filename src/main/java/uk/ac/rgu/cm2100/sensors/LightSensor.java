/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100.sensors;

/**
 *
 * @author mark
 */
public class LightSensor extends Sensor {
    
    private int lightLevel;
    
    public LightSensor(String name){
        super(name);
        this.lightLevel = 0;
    }
    
    public void setLightLevel(int level){
        this.lightLevel = level;
    }
    
    public int getLightLevel(){
        return this.lightLevel;
    }
    
}
