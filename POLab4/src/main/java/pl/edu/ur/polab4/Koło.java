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
public class Koło {

    int promień;
    float pole, obwód;

    public Koło(int promień) {
        this.promień = promień;
    }

    public void Obwod() {
        this.obwód = (float) (2 * Math.PI * this.promień);
    }

    public void Pole() {
        this.pole = (float) (Math.PI * (this.promień * this.promień));
    }

    public void wyswietlDane() {
        this.Pole();
        this.Obwod();
        System.out.println("\nKoło:");
        System.out.println("\nPole koła wynosi: " + this.pole);
        System.out.println("\nObwód koła wynosi: " + this.obwód);
    }
}
