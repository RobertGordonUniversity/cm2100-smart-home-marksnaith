/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100.devices;

import uk.ac.rgu.cm2100.devices.logging.DeviceLogger;
import uk.ac.rgu.cm2100.devices.status.DeviceStatus;
import java.io.IOException;
import java.util.Comparator;

/**
 * Class to model a base device, with shared functionality
 *
 * @author mark
 */
public abstract class Device implements Comparable<Device> {

    protected String name;
    private DeviceLogger logger;

    protected DeviceStatus status;

    private int serialNumber = 0;

    public Device(String name) {
        this.name = name;

        /* Try to create a logger for this device */
        try {
            this.logger = new DeviceLogger(this.name + "_log");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public DeviceStatus getDeviceStatus() {
        return this.status;
    }

    public final String getName() {
        return this.name;
    }

    public final void setSerialNumber(int number) {
        this.serialNumber = number;
    }

    public final int getSerialNumber() {
        return this.serialNumber;
    }

    protected void writeToLog(String message) {
        this.logger.log(message);
    }

    public final void printLog() {
        System.out.println("===Log for " + this.name + "===");
        this.logger.readLog();
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
    public int compareTo(Device other) {

        if (this.serialNumber < other.serialNumber) {
            return -1;
        } else if (this.serialNumber > other.serialNumber) {
            return 1;
        } else {
            return 0;
        }
    }

    public static class DeviceComparator implements Comparator<Device> {

        @Override
        public int compare(Device o1, Device o2) {

            String type1 = o1.getClass().getSimpleName().toLowerCase();
            String type2 = o2.getClass().getSimpleName().toLowerCase();

            return type1.compareTo(type2);
        }

    }
}
