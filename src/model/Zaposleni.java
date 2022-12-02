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
public class Zaposleni implements ApstraktniDomenskiObjekat {
    
    private int zaposleniID;
    private String ime;
    private String prezime;
    private String username;
    private String password;
    private boolean predaje;

    public Zaposleni() {
    }

    public Zaposleni(int zaposleniID, String ime, String prezime, String username, String password, boolean predaje) {
        this.zaposleniID = zaposleniID;
        this.ime = ime;
        this.prezime = prezime;
        this.username = username;
        this.password = password;
        this.predaje = predaje;
    }
    public Zaposleni( String ime, String prezime, String username, String password, boolean predaje) {
        this.ime = ime;
        this.prezime = prezime;
        this.username = username;
        this.password = password;
        this.predaje = predaje;
    }
    
    

    public int getZaposleniID() {
        return zaposleniID;
    }

    public void setZaposleniID(int zaposleniID) {
        this.zaposleniID = zaposleniID;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isPredaje() {
        return predaje;
    }

    public void setPredaje(boolean predaje) {
        this.predaje = predaje;
    }

    @Override
    public String toString() {
        return "Zaposleni{" + "zaposleniID=" + zaposleniID + ", ime=" + ime + ", prezime=" + prezime + '}';
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
        final Zaposleni other = (Zaposleni) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        return Objects.equals(this.password, other.password);
    }

    
    
    

    @Override
    public String vratiNazivTabele() {
     return "zaposleni";
    }

    @Override
    public List<ApstraktniDomenskiObjekat> vratiListu(ResultSet rs) throws Exception {
           List<ApstraktniDomenskiObjekat> lista = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("zaposleni.zaposleniID");
            String ime = rs.getString("zaposleni.ime");
            String prezime = rs.getString("zaposleni.prezime");
            String email = rs.getString("zaposleni.username");
            String lozinka = rs.getString("zaposleni.password");
            boolean predaje = rs.getBoolean("zaposleni.predaje");
            Zaposleni zaposleni = new Zaposleni(id, ime, prezime, email, lozinka, predaje);
            System.out.println(zaposleni);
            lista.add(zaposleni);
        }
        return lista;
    }

    @Override
    public String vratiKoloneZaUbacivanje() {
        return "ime, prezime, username, password, predaje";
    }

    @Override
    public String vratiVrednostiZaUbacivanje() {
    return "'" + ime + "','" + prezime + "'"+"'" + username + "','" + password + "'," + predaje;
    }

    @Override
    public String vratiPrimarniKljuc() {
        return "zaposleni.zaposleniID=" + zaposleniID;
    }

    @Override
    public ApstraktniDomenskiObjekat vratiObjekatIzRS(ResultSet rs) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String vratiVrednostiZaIzmenu() {
    return "ime = '" + ime + "',prezime='" + prezime + "'"+"username = '" + username + "',password='"+password + ", predaje= "+ predaje;
    }
    
    
    
}
