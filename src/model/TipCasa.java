/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.ResultSet;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Viktorija
 */
public class TipCasa implements ApstraktniDomenskiObjekat {
    
    private int tipCasaID;
    private String nazivCasa;
    private int cenaCasa;

    public int getTipCasaID() {
        return tipCasaID;
    }

    public void setTipCasaID(int tipCasaID) {
        this.tipCasaID = tipCasaID;
    }

    public String getNazivCasa() {
        return nazivCasa;
    }

    public void setNazivCasa(String nazivCasa) {
        this.nazivCasa = nazivCasa;
    }

    public int getCenaCasa() {
        return cenaCasa;
    }

    public void setCenaCasa(int cenaCasa) {
        this.cenaCasa = cenaCasa;
    }

    @Override
    public String toString() {
        return "TipCasa{" + "tipCasaID=" + tipCasaID + ", nazivCasa=" + nazivCasa + ", cenaCasa=" + cenaCasa + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TipCasa other = (TipCasa) obj;
        if (this.tipCasaID != other.tipCasaID) {
            return false;
        }
        if (this.cenaCasa != other.cenaCasa) {
            return false;
        }
        return Objects.equals(this.nazivCasa, other.nazivCasa);
    }
    
    

    @Override
    public String vratiNazivTabele() {
        return "tipcasa";
    }

    @Override
    public List<ApstraktniDomenskiObjekat> vratiListu(ResultSet rs) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String vratiKoloneZaUbacivanje() {
        return "nazivCasa, cenaCasa";
    }

    @Override
    public String vratiVrednostiZaUbacivanje() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String vratiPrimarniKljuc() {
        return "tipcasa.tipCasaID=" + tipCasaID;
    }

    @Override
    public ApstraktniDomenskiObjekat vratiObjekatIzRS(ResultSet rs) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String vratiVrednostiZaIzmenu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
