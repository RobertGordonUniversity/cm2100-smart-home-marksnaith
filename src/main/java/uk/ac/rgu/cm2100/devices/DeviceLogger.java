/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100.devices;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mark
 */
public class DeviceLogger {

    private final String filename;

    public DeviceLogger(String filename) throws IOException {
        this.filename = filename + ".txt";

        File log = new File(this.filename);

        log.createNewFile();

    }

    public void log(String message) {

        try (FileWriter fw = new FileWriter(this.filename, true);
                BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write(message + "\n");
            bw.close();
            fw.close();

        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

    public void readLog() {
        
        try(FileReader fr = new FileReader(this.filename);
                BufferedReader br = new BufferedReader(fr)){
            
            String line;// = br.readLine();
            
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            
            br.close();
            fr.close();
            
        }catch(IOException ex){
            System.out.println("Error: " + ex.getMessage());
        }
   
    }

}
