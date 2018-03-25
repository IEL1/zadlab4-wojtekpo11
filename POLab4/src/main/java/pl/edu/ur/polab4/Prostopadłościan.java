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
public class Prostopadłościan {

    double powierzchnia, objętość;
    int a, b, c;

    public Prostopadłościan(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void Powierzchnia() {
        this.powierzchnia = 2 * (a * b + a * c + b * c);
    }

    public void Objętość() {
        this.objętość = a * b * c;
    }

    public void wyswietlDane() {
        this.Powierzchnia();
        this.Objętość();
        System.out.println("\nProstopadłościan:");
        System.out.println("\nDługość prostopadłościanu wynosi: " + this.a);
        System.out.println("\nSzerokość prostopadłościanu wynosi: " + this.b);
        System.out.println("\nWysokość prostopadłościanu wynosi: " + this.c);
        System.out.println("\nPowierzchnia prostopadłościanu wynosi: " + this.powierzchnia);
        System.out.println("\nObjętość prostopadłościanu wynosi: " + this.objętość);
    }
}
