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
public class Prostokąt {

    int a, b, pole, obwód;

    public Prostokąt(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void Pole() {
        this.pole = this.a * this.b;
    }

    public void Obwod() {
        this.obwód = (this.a * 2) + (this.b * 2);
    }

    public void wyswietlDane() {

        this.Pole();
        this.Obwod();
        System.out.println("\nProstokąt:");
        System.out.println("\nPierwszy bok prostokąta wynosi: " + this.a);
        System.out.println("\nDrugi bok prostokąta wynosi: " + this.b);
        System.out.println("\nPole prostokąta wynosi: " + this.pole);
        System.out.println("\nObwód prostokąta wynosi: " + this.obwód);
    }
}
