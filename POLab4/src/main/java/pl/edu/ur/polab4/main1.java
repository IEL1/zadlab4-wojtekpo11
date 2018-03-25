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
public class main1 {

    public static void main(String[] args) {

        Prostokąt Prostokąt1 = new Prostokąt(2, 6);
        Prostokąt1.wyswietlDane();
        
        Kwadrat Kwadrat1 = new Kwadrat(4);
        Kwadrat1.wyswietlDane();

        Koło Koło1 = new Koło(25);
        Koło1.wyswietlDane();

        Kula Kula1 = new Kula(9);
        Kula1.wyswietlDane();

        Stożek Stożek1 = new Stożek(5, 8);
        Stożek1.wyswietlDane();
        
        Prostopadłościan Prostopadłościan1 = new Prostopadłościan(6, 8, 10);
        Prostopadłościan1.wyswietlDane();

        Sześcian Sześcian1 = new Sześcian(5);
        Sześcian1.wyswietlDane();

        
    }
}
