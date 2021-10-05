/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100;

/**
 *
 * @author mark
 */
public class Light implements Switchable, Colourable {
    
    private Colour colour;
    
    public Light(int r, int g, int b){
        this.colour = new Colour(r, g, b);
    }
    
    public void switchOn(){
        System.out.println("Light is on");
    }
    
    public void switchOff(){
        System.out.println("Light is off");
    }
    
    public void setColour(int r, int g, int b){
        this.colour = new Colour(r, g, b);
        System.out.println("Light colour is " + colour);
    }
    
    public Colour getColour(){
        return this.colour;
    }

    private class Colour{
        
        private int r, g, b;
        
        public Colour(int r, int g, int b){
            this.r = r;
            this.g = g;
            this.b = b;
        }
        
        public int getR(){
            return this.r;
        }
        
        public int getG(){
            return this.g;
        }
        
        public int getB(){
            return this.b;
        }
        
        @Override
        public String toString(){
            return this.r + " " + this.g + " " + this.b;
        }
       
    }
    
    
    
}
