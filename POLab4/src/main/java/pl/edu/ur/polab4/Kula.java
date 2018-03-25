/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *
 * @author Wojciech
 */
public class Kula {

    int r;
    float powierzchnia, objętość;

    public Kula(int r) {
        this.r = r;
    }

    public void powierzchnia() {
        this.powierzchnia = (float) (4 * Math.PI * Math.pow(this.r, 2));
    }

    public void objetosc() {
        this.objętość = (float) ((4 / 3) * (Math.PI * Math.pow(this.r, 3)));
    }

    public void wyswietlDane() {
        this.objetosc();
        this.powierzchnia();
        System.out.println("\nKula:");
        System.out.println("\nObjętość kuli wynosi: " + this.objętość);
        System.out.println("\nPromień kuli wynosi: " + this.r);
        System.out.println("\nPowierzchnia kuli wynosi: " + this.powierzchnia);
    }
}
