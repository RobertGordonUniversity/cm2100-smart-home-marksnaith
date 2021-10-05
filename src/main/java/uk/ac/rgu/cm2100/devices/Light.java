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
public class Light {
    
    private Colour colour;
    private String name;
    
    public Light(String name){
        this.name = name;
        this.colour = new Colour(255, 255, 255);
    }
    
    public void switchOn(){
        System.out.println("Light is switched on");
    }
    
    public void switchOff(){
        System.out.println("Light is switched off");
    }
    
    public void setColour(int r, int g, int b){
        this.colour = new Colour(r, g, b);
    }
    
    public class Colour{
        
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
    }
    
}
