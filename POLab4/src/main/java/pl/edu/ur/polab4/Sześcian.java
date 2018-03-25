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
public class Sześcian {

    int a;
    double powierzchnia, objętość;

    public Sześcian(int a) {
        this.a = a;
    }

    public void powierzchnia() {
        this.powierzchnia = Math.pow(a, 2) * 6;
    }

    public void objetosc() {
        this.objętość = Math.pow(a, 3);
    }

    public void wyswietlDane() {
        this.powierzchnia();
        this.objetosc();
        System.out.println("\nSześcian:");
        System.out.println("\nBok sześcianu wynosi: " + this.a);
        System.out.println("\nPowierzchnia sześcianu wynosi: " + this.powierzchnia);
        System.out.println("\nObjętość sześcianu wynosi: " + this.objętość);
    }
}
