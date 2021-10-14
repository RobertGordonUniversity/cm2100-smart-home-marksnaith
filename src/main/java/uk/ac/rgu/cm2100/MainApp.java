/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100;

import uk.ac.rgu.cm2100.commands.ColourCommand;
import uk.ac.rgu.cm2100.commands.PlayCommand;
import uk.ac.rgu.cm2100.devices.Light;
import uk.ac.rgu.cm2100.devices.Stereo;
import uk.ac.rgu.cm2100.devices.Stereo.Song;
import uk.ac.rgu.cm2100.devices.TVStick;
import uk.ac.rgu.cm2100.devices.TVStick.Video;



/**
 * Main class for running and testing the SmartHome application
 *
 * @author Mark Snaith
 */
public class MainApp {

    /**
     * Main method for running the SmartHome application
     *
     * @param args
     */
    public static void main(String[] args) {

        var home = new Home();
        var light = new Light("hall");
        
        var tvStick = new TVStick();
        var stereo = new Stereo();
        
        home.addCommand("light_colour", new ColourCommand(light));
        home.addCommand("play_video", new PlayCommand<Video>(tvStick));
        home.addCommand("play_song", new PlayCommand<Song>(stereo));
        
        home.addCommand("light_on", light::switchOn);
        
        home.executeCommand("light_colour", 21, 86, 35);
        
        home.executeCommand("light_on");
        
        home.executeCommand("play_video", new Video("Stranger Things", "Nextflix"));
        home.executeCommand("play_song", new Song("500 Miles", "The Proclaimers"));
        
        
        
    }

}
