/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import uk.ac.rgu.cm2100.commands.Command;
import uk.ac.rgu.cm2100.devices.Device;
import uk.ac.rgu.cm2100.devices.Device.DeviceComparator;
import uk.ac.rgu.cm2100.sensors.SensorStrategy;

/**
 * Home class to act as the hub for the smart home
 *
 * @author Mark Snaith
 */
public class Home{
    
    private final List<Device> devices;
    private final Map<String, Command> commandsMap;
    
    private final Map<String, SensorStrategy> sensorStrategies;
    
    public Home() {
        this.devices = new ArrayList<>();        
        this.commandsMap = new HashMap<>();
        this.sensorStrategies = new HashMap<>();
    }
    
    public void addDevice(Device device) {
        this.devices.add(device);
    }
    
    public List<Device> getDevices() {
        return this.devices;
    }
    
    public List<Device> getDevicesByName() {
        Collections.sort(this.devices);
        return this.devices;
    }
    
    public List<String> getDevicesByType() {
        
        List<String> result = this.devices.stream()
                .sorted(new DeviceComparator())
                .map((d) -> d.getName() + " " + d.getClass().getSimpleName())
                .collect(Collectors.toList());
        
        return result;
    }

    /**
     * Method to add a command with the given name
     *
     * @param name
     * @param command
     */
    public void addCommand(String name, Command command, Device device) {
        
        this.devices.add(device);        
        this.commandsMap.put(name, command);
    }

    /**
     * Method to execute the command with the given name, passing the given
     * parameters
     *
     * @param name
     * @param parameters
     */
    public void executeCommand(String name, Object... parameters) {
        
        Command c = this.commandsMap.get(name);

        /* If we have a command, add the parameters then execute */
        if (c != null) {
            c.addParameters(parameters);
            c.execute();
        }
    }
    
    public void addSensorStrategy(String sensorName, SensorStrategy strategy) {
        this.sensorStrategies.put(sensorName, strategy);
    }
    
    @Override
    public String toString() {
        return "My smart home";
    }
    
}
