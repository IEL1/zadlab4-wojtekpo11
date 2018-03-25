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
public class Stożek {

    float powierzchnia, powierzchniaBocz, powierzchniaPod, objętość, l;
    int r, wysokosc;
    

    public Stożek(int r, int wysokosc) {
        this.r = r;
        this.wysokosc = wysokosc;
    }

    public void objetosc() {
        this.objętość = (float) ((Math.PI * (this.r * this.r) * this.wysokosc) / 3);
    }

    public void powierzchnia() {
        this.l = (float) Math.sqrt((this.r * this.r) + (this.wysokosc * this.wysokosc));
        this.powierzchniaPod = (float) (Math.PI * this.r * this.r);
        this.powierzchniaBocz = (float) (Math.PI * this.r * this.l);
        this.powierzchnia = (float) (this.powierzchniaBocz + this.powierzchniaPod);
    }

    public void wyswietlDane() {
        this.objetosc();
        this.powierzchnia();
        System.out.println("\nStożek:");
        System.out.println("\nPromien stożka wynosi: " + this.r);
        System.out.println("\nWysokość stożka wynosi: " + this.wysokosc);
        System.out.println("\nTworząca stożka wynosi: " + this.l);
        System.out.println("\nObjętość stożka wynosi: " + this.objętość);
        System.out.println("\nPowierzchnia stożka wynosi: " + this.powierzchnia);
    }
}
