/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package komunikacija;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.net.Socket;

/**
 *
 * @author Viktorija
 */
public class Primalac implements Serializable{
    private Socket soket;

    public Primalac(Socket soket) {
        this.soket = soket;
    }
    
    public Object primi() throws Exception{
        try {
            ObjectInputStream in=new ObjectInputStream(soket.getInputStream());
            return in.readObject();
        } catch (Exception ex) {

            throw new Exception("Greska prilikom primanja objekta!\n"+ex.getMessage());
        }
    }
    
}
