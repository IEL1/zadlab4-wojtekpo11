/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadzDane;

/**
 *
 * @author Wojciech
 */
public class Student {

    String imie, nazwisko, nazwaSpecjalności;
    int nr_indeksu;
    int rok_studiów;

    public Student(String imie, String nazwisko, int nr_indeksu, String nazwaSpecjalności, int rok_studiów) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
        this.nazwaSpecjalności = nazwaSpecjalności;
        this.rok_studiów = rok_studiów;
    }

    public void pokazDane() {
        System.out.println("Osoba");
        System.out.println("imie: " + this.imie);
        System.out.println("nazwisko: " + this.nazwisko);
        System.out.println("nr indeksu: " + this.nr_indeksu);
        System.out.println("nazwa specjalności: " + this.nazwaSpecjalności);
        System.out.println("Rok studiów: " + this.rok_studiów);
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getNr_indeksu() {
        return nr_indeksu;
    }

    public String getNazwaSpecjalnosci() {
        return nazwaSpecjalności;
    }

    public int getRok_studiow() {
        return rok_studiów;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setNr_indeksu(int nr_indeksu) {
        this.nr_indeksu = nr_indeksu;
    }

    public void setNazwaSpecjalnosci(String nazwaSpecjalnosci) {
        this.nazwaSpecjalności = nazwaSpecjalnosci;
    }

    public void setRok_studiow(int rok_studiow) {
        this.rok_studiów = rok_studiow;
    }
}
