/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100;

import uk.ac.rgu.cm2100.commands.Command;

/**
 * Home class to act as the hub for the smart home
 *
 * @author Mark Snaith
 */
public class Home {

    private final String[] labels;
    private final Command[] commands;

    private int numCommands = 0; //keep track of the number of commands

    public Home() {
        this.labels = new String[10];
        this.commands = new Command[10];
    }

    /**
     * Method to add a command with the given name
     *
     * @param name
     * @param command
     */
    public void addCommand(String name, Command command) throws TooManyCommandsException{
        try {
            this.labels[this.numCommands] = name;
            this.commands[this.numCommands] = command;
            this.numCommands++;
        } catch (ArrayIndexOutOfBoundsException ex) {
            throw new TooManyCommandsException("Can't add command: " + name);
        }
    }

    /**
     * Method to execute the command with the given name, passing the given
     * parameters
     *
     * @param name
     * @param parameters
     */
    public void executeCommand(String name, Object... parameters) {

        Command c = null;

        /* Loop over all the labels until we find a match - if one exists */
        for (int i = 0; i < this.labels.length; i++) {
            if (name.equals(this.labels[i])) {
                c = this.commands[i];
                break; //don't keep looping
            }
        }

        /* If we have a command, add the parameters then execute */
        if (c != null) {
            c.addParameters(parameters);
            c.execute();
        }
    }

    /**
     * Method to execute the no-parameter command with the given name
     *
     * @param name
     */
//    public void executeCommand(String name) {
//        //simply call the other method, passing an empty object array
//        this.executeCommand(name, new Object[0]);
//    }
    @Override
    public String toString() {
        return "My smart home";
    }

}
