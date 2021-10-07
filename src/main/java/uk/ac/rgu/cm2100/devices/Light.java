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
public class Light extends Device implements Switchable, Dimmable, Colourable{
    
    private Colour colour;
    
    public Light(String name){
        super(name);
        this.colour = new Colour(255, 255, 255);
    }
    
    public Colour getColour(){
        return this.colour;
    }

    @Override
    public void switchOn() {
        System.out.println("Light is on");
        }

    @Override
    public void switchOff() {
        System.out.println("Light is off");
        
     }

    @Override
    public void dimUp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dimDown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setColour(int r, int g, int b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
