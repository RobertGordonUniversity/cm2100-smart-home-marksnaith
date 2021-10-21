/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100.devices;

import uk.ac.rgu.cm2100.devices.TVStick.Video;

/**
 *
 * @author mark
 */
public class TVStick implements Playable<Video> {

    @Override
    public void play(Video media) {
        System.out.println("Playing " + media);
    }

    public static class Video {

        private String title;
        private String platform;

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
