/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package komunikacija;

import java.io.Serializable;
import komunikacija.util.Operacije;

/**
 *
 * @author Viktorija
 */
public class Odgovor implements Serializable {
    private Exception greska;
    private Object podatak;
    private Operacije operacija;

    public Odgovor() {
    }

    public Exception getGreska() {
        return greska;
    }

    public void setGreska(Exception greska) {
        this.greska = greska;
    }

    public Object getPodatak() {
        return podatak;
    }

    public void setPodatak(Object podatak) {
        this.podatak = podatak;
    }

    public Operacije getOperacija() {
        return operacija;
    }

    public void setOperacija(Operacije operacija) {
        this.operacija = operacija;
    }

    @Override
    public String toString() {
        return "Odgovor{" + "greska=" + greska + ", podatak=" + podatak + ", operacija=" + operacija + '}';
    }

    
    
}
