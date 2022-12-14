/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Viktorija
 */
public class Kandidat implements ApstraktniDomenskiObjekat {
    
    private int kandidatID;
    private String ime;
    private String prezime;
    private String brojTelefona;
    private String adresa;

    public Kandidat() {
    }

    public Kandidat(int kandidatID, String ime, String prezime, String brojTelefona, String adresa) {
        this.kandidatID = kandidatID;
        this.ime = ime;
        this.prezime = prezime;
        this.brojTelefona = brojTelefona;
        this.adresa = adresa;
    }

    
    public int getKandidatID() {
        return kandidatID;
    }

    public void setKandidatID(int kandidatID) {
        this.kandidatID = kandidatID;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Kandidat{" + "kandidatID=" + kandidatID + ", ime=" + ime + ", prezime=" + prezime + ", brojTelefona=" + brojTelefona + ", adresa=" + adresa + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Kandidat other = (Kandidat) obj;
        if (this.kandidatID != other.kandidatID) {
            return false;
        }
        if (!Objects.equals(this.ime, other.ime)) {
            return false;
        }
        if (!Objects.equals(this.prezime, other.prezime)) {
            return false;
        }
        if (!Objects.equals(this.brojTelefona, other.brojTelefona)) {
            return false;
        }
        return Objects.equals(this.adresa, other.adresa);
    }
    
    

    @Override
    public String vratiNazivTabele() {
        return "kandidat";
    }

    @Override
    public List<ApstraktniDomenskiObjekat> vratiListu(ResultSet rs) throws Exception {
 List<ApstraktniDomenskiObjekat> lista = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("kandidat.kandidatID");
            String ime = rs.getString("kandidat.ime");
            String prezime = rs.getString("kandidat.prezime");
            String brojTelefona = rs.getString("kandidat.brojTelefona");
            String adresa = rs.getString("kandidat.adresa");
            
            Kandidat kandidat = new Kandidat(id, ime, prezime, brojTelefona, adresa);
            System.out.println(kandidat);
            lista.add(kandidat);
        }
        return lista;
    }

    @Override
    public String vratiKoloneZaUbacivanje() {
        return "ime, prezime, brojTelefona, adresa";
    }

    @Override
    public String vratiVrednostiZaUbacivanje() {
    return "'" + ime + "','" + prezime + "','" + brojTelefona + "','" + adresa + "'";
    }

    @Override
    public String vratiPrimarniKljuc() {
        return "kandidat.kandidatID=" + kandidatID;
    }

    @Override
    public ApstraktniDomenskiObjekat vratiObjekatIzRS(ResultSet rs) throws Exception {
    ApstraktniDomenskiObjekat kandidat = null;
        while (rs.next()) {
             int kandidatID = rs.getInt("kandidat.kandidatID");
            String ime = rs.getString("kandidat.ime"); 
            String prezime = rs.getString("kandidat.prezime");
            String brojTelefona = rs.getString("kandidat.brojTelefona"); 
            String adresa=rs.getString("kandidat.adresa");
            kandidat = new Kandidat(kandidatID, ime, prezime, brojTelefona, adresa);
            System.out.println(kandidat);
        }
    return kandidat;
    }

    @Override
    public String vratiVrednostiZaIzmenu() {
    return "ime = '" + ime +"',prezime = '" + prezime+ "',brojTelefona='" + brojTelefona + "',adresa='" + adresa + "'";
    }
    
}
