/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100.devices;

/**
 *
 * @author mark
 */
public class Light extends Device implements Switchable, Dimmable, Colourable {

    private Colour colour;

    public Light(String name) {
        super(name);
        this.colour = new Colour(255, 255, 255);
    }

    public Colour getColour() {
        return this.colour;
    }

    @Override
    public void switchOn() {
        System.out.println(this.name + " light is on");
        this.writeToLog(this.name + " light is on");
        this.setStatus(OnOffStatus.ON);
    }

    @Override
    public void switchOff() {
        System.out.println(this.name + " light is off");
        this.writeToLog(this.name + " light is off");
        this.setStatus(OnOffStatus.OFF);

    }

    @Override
    public void dimUp() {
        System.out.println(this.name + " light dimmed up");
    }

    @Override
    public void dimDown() {
        System.out.println(this.name + " light dimmed down");
    }

    @Override
    public void setColour(int r, int g, int b) {
        this.colour = new Colour(r, g, b);
        System.out.println(this.name + " light colour set to " + this.colour); 
        this.writeToLog(this.name + " light colour set to " + this.colour);
    }

    public class Colour {

        private int r, g, b;

        public Colour(int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
        }

        public int getR() {
            return this.r;
        }

        public int getG() {
            return this.g;
        }

        public int getB() {
            return this.b;
        }
        
        @Override
        public String toString(){
            return this.r + "," + this.g + "," + this.b;
        }
    }

}
