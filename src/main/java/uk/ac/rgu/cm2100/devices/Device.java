/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100.devices;

import java.io.IOException;
import java.util.Comparator;

/**
 *
 * @author mark
 */
public abstract class Device implements Comparable<Device> {

    protected String name;
    private DeviceLogger logger;

    private DeviceStatus status;

    public Device(String name) {
        this.name = name;

        try {
            this.logger = new DeviceLogger(this.name + "_log");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    protected void setDeviceStatus(DeviceStatus status) {
        this.status = status;
    }

    public DeviceStatus getDeviceStatus() {
        return this.status;
    }

    protected void writeToLog(String message) {
        this.logger.log(message);
    }

    public final void printLog() {
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

    @Override
    public final boolean equals(Object other) {
        if (other != null & other.getClass().equals(this.getClass())) {
            Device otherDevice = (Device) other;
            return otherDevice.name.equals(this.name);
        }
        return false;
    }
    
    @Override
    public int compareTo(Device other){
        return this.name.compareTo(other.name);
    }
    
    
    public static class DeviceComparator implements Comparator<Device>{

        @Override
        public int compare(Device o1, Device o2) {
            String name1 = o1.getClass().getSimpleName();
            String name2 = o2.getClass().getSimpleName();
            
            
            return name1.compareTo(name2);
        }
        
    }
}
