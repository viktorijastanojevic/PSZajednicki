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
public class Zahtev implements Serializable{
    private Operacije operacija;
    private Object podatak;

    public Zahtev() {
    }

    public Zahtev(Operacije operacija, Object podatak) {
        this.operacija = operacija;
        this.podatak = podatak;
    }

    public Operacije getOperacija() {
        return operacija;
    }

    public void setOperacija(Operacije operacija) {
        this.operacija = operacija;
    }

    public Object getPodatak() {
        return podatak;
    }

    public void setPodatak(Object podatak) {
        this.podatak = podatak;
    }

    @Override
    public String toString() {
        return "Zahtev{" + "operacija=" + operacija + ", podatak=" + podatak + '}';
    }

   
}
