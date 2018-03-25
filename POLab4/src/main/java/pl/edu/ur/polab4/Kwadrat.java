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
public class Kwadrat {

    int a, pole, obwód;

    public Kwadrat(int a) {
        this.a = a;
    }

    public void Pole() {
        this.pole = this.a * this.a;
    }

    public void Obwód() {
        this.obwód = this.a * 4;
    }

    public void wyswietlDane() {
        this.Pole();
        this.Obwód();

        System.out.println("\nKwadrat:");
        System.out.println("\nBok kwadratu wynosi: " + this.a);
        System.out.println("\nObwód kwadratu wynosi: " + this.obwód);
        System.out.println("\nPole kwadratu wynosi: " + this.pole);
    }
}
