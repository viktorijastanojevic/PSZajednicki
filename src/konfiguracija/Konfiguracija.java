/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konfiguracija;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Viktorija
 */
public class Konfiguracija {
    private static Konfiguracija instanca;
    private Properties konfiguracija;

    private Konfiguracija() {
        try {
            konfiguracija = new Properties();
            konfiguracija.load(new FileInputStream("C:\\Users\\Viktorija\\OneDrive\\Documents\\NetBeansProjects\\Zajednicki\\konfiguracija.properties")); 
        } catch (IOException ex) {
            Logger.getLogger(Konfiguracija.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Konfiguracija getInstanca() {
        if (instanca == null) {
            instanca = new Konfiguracija();
        }
        return instanca;
    }

    public Properties getKonfiguracija() {
        return konfiguracija;
    }

    public String getProperty(String key) {
        return konfiguracija.getProperty(key, "n/a");
    }

    public void setProperty(String key, String value) {
        konfiguracija.setProperty(key, value);
    }

      public void sacuvajIzmene() {
        try {
            //../A_Zajednicki/konfiguracija.properties
            konfiguracija.store(new FileOutputStream("C:\\Users\\Viktorija\\OneDrive\\Documents\\NetBeansProjects\\Zajednicki\\konfiguracija.properties"), null);

        } catch (IOException ex) {
            Logger.getLogger(Konfiguracija.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    
}
