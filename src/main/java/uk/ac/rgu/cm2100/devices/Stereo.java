/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100.devices;

import uk.ac.rgu.cm2100.devices.functionality.Playable;
import uk.ac.rgu.cm2100.devices.Stereo.Song;

/**
 * Class representing a stereo in the smart home
 * @author mark
 */
public class Stereo extends Device implements Playable<Song>  {

    public Stereo(String name) {
        super(name);
    }

    @Override
    public void play(Song media) {
        System.out.println("Playing " + media);
    }
    
    /**
     * Nested class to represent a song that can be played
     */
    public static class Song{
        private final String title;
        private final String artist;
        
        public Song(String title, String artist){
            this.title = title;
            this.artist = artist;
        }
        
        @Override
        public String toString(){
            return this.title + " by " + this.artist;
        }
        
    }

    
}
