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
public class StavkaRacuna implements ApstraktniDomenskiObjekat {
    
   private int racunID;
   private int rbStavke;
   private int brojCasova;
   private int cenaStavke;
   private TipCasa tipCasa;

    public int getRacunID() {
        return racunID;
    }

    public void setRacunID(int racunID) {
        this.racunID = racunID;
    }

    public int getRbStavke() {
        return rbStavke;
    }

    public void setRbStavke(int rbStavke) {
        this.rbStavke = rbStavke;
    }

    public int getBrojCasova() {
        return brojCasova;
    }

    public void setBrojCasova(int brojCasova) {
        this.brojCasova = brojCasova;
    }

    public int getCenaStavke() {
        return cenaStavke;
    }

    public void setCenaStavke(int cenaStavke) {
        this.cenaStavke = cenaStavke;
    }

    public TipCasa getTipCasa() {
        return tipCasa;
    }

    public void setTipCasa(TipCasa tipCasa) {
        this.tipCasa = tipCasa;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final StavkaRacuna other = (StavkaRacuna) obj;
        if (this.racunID != other.racunID) {
            return false;
        }
        if (this.rbStavke != other.rbStavke) {
            return false;
        }
        if (this.brojCasova != other.brojCasova) {
            return false;
        }
        if (this.cenaStavke != other.cenaStavke) {
            return false;
        }
        return Objects.equals(this.tipCasa, other.tipCasa);
    }

    @Override
    public String toString() {
        return "StavkaRacuna{" + "racunID=" + racunID + ", rbStavke=" + rbStavke + ", brojCasova=" + brojCasova + ", cenaStavke=" + cenaStavke + ", tipCasa=" + tipCasa + '}';
    }
   
   

    @Override
    public String vratiNazivTabele() {
        return "stavkaracuna";
    }

    @Override
    public List<ApstraktniDomenskiObjekat> vratiListu(ResultSet rs) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String vratiKoloneZaUbacivanje() {
        return "brojCasova, cenaStavke, tipCasaID";
    }

    @Override
    public String vratiVrednostiZaUbacivanje() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String vratiPrimarniKljuc() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
