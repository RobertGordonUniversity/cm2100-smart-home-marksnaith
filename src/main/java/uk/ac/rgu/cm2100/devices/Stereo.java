/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100.devices;

import uk.ac.rgu.cm2100.devices.Stereo.Song;

/**
 *
 * @author mark
 */
public class Stereo implements Playable<Song>  {

    @Override
    public void play(Song media) {
        System.out.println("Playing " + media);
    }
    
    public static class Song{
        private String title;
        private String artist;
        
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
