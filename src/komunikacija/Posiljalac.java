/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package komunikacija;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.net.SocketException;

/**
 *
 * @author Viktorija
 */
public class Posiljalac implements Serializable{
    private Socket soket;

    public Posiljalac(Socket socket) {
        this.soket = socket;
    }
    
    
    public void posalji(Object object) throws Exception{
        try{
            ObjectOutputStream out = new ObjectOutputStream(soket.getOutputStream());
            out.writeObject(object);
    
        }catch(SocketException se){
            throw se;
        }
        catch(Exception e){
            throw new Exception("Greska pri slanju objekta\n"+e.getMessage());
        }
    }
    
}
