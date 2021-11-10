/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100.devices;

import uk.ac.rgu.cm2100.devices.functionality.Playable;
import uk.ac.rgu.cm2100.devices.TVStick.Video;

/**
 * Class representing a TV stick in the smart home
 * @author mark
 */
public class TVStick extends Device implements Playable<Video> {

    public TVStick(String name) {
        super(name);
    }

    @Override
    public void play(Video media) {
        System.out.println("Playing " + media);
    }

    /**
     * Nested class to represent a video that can be played
     */
    public static class Video {

        private final String title;
        private final String platform;

        public Video(String title, String platform) {
            this.title = title;
            this.platform = platform;
        }
        
        @Override
        public String toString(){
            return this.title + " on " + this.platform;
        }
    }

}
