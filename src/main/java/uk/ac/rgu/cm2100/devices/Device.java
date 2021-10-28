/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100.devices;

import java.io.IOException;

/**
 *
 * @author mark
 */
public abstract class Device {

    protected String name;

    private DeviceLogger logger;
    
    private DeviceStatus status;

    public Device(String name) {
        this.name = name;
        try {
            this.logger = new DeviceLogger(this.name + "_log");
        } catch (IOException ex) {
            System.out.println("Error creating log file: " + ex.getMessage());
        }
    }
    
    protected void setStatus(DeviceStatus status){
        this.status = status;
    }
    
    protected void writeToLog(String message){
        this.logger.log(message);
    }
    
    public DeviceStatus getStatus(){
        return this.status;
    }
    
    public final void printLog(){
        System.out.println("===Log for " + this.name + "===");
        this.logger.readLog();
    }

    public final String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + " " + this.getClass().getSimpleName();
    }
}
