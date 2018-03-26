/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadzDane;

import java.util.Scanner;

/**
 *
 * @author Wojciech
 */
public class Tablica100 {

    Student tab1[] = new Student[15];

    public void wp() {
        for (int i = 0; i < 15; i++) {
            Student student1 = new Student("", "", 0, "", 0);
            tab1[i] = student1;
        }
    }

    public void wybierz() {
        Scanner in = new Scanner(System.in);
        int wybierz = 1;

        while (wybierz != 0) {
            System.out.println("\n1. Wprowadz dane studentów");
            System.out.println("2. Edycja danych studenta");
            System.out.println("3. Usunięcie danych studenta");
            System.out.println("4. Wyświetlenie obiektu o danym indeksie");
            System.out.println("5. Wyświetlenie danych wszystkich studentów");
            System.out.println("6. Wyświetlenie zakresu obiektów w podanym zakresie");
            System.out.println("0. Koniec");
            wybierz = in.nextInt();

            switch (wybierz) {
                case 1:
                    wprowadzanie();
                    break;
                case 2:
                    edytowanie();
                    break;
                case 3:
                    usuwanie();
                    break;
                case 4:
                    wyswietlInd();
                    break;
                case 5:
                    wyswietlAll();
                    break;
                case 6:
                    wyswietlZakres();
                    break;
                case 0:
                    break;
            }
        }
    }

    private void wprowadzanie() {
        Scanner inImie = new Scanner(System.in);
        Scanner inNazwisko = new Scanner(System.in);
        Scanner inSpecjalnosc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj inkeds:");
        int id = in.nextInt();

        System.out.println("\nPodaj imię: ");
        tab1[id].setImie(inImie.nextLine());
        System.out.println("\nPodaj nazwisko: ");
        tab1[id].setNazwisko(inNazwisko.nextLine());
        System.out.println("\nPodaj Numer Indeksu: ");
        tab1[id].setNr_indeksu(in.nextInt());
        System.out.println("\nPodaj Nazwe specjalności: ");
        tab1[id].setNazwaSpecjalnosci(inSpecjalnosc.nextLine());
        System.out.println("\nPodaj Rok studiów: ");
        tab1[id].setRok_studiow(in.nextInt());
    }

    private void edytowanie() {
        Scanner inImie = new Scanner(System.in);
        Scanner inNazwisko = new Scanner(System.in);
        Scanner inSpecjalnosc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
    }

    public void usuwanie() {
        Scanner w = new Scanner(System.in);
        int id;
        System.out.println("\nPodaj numer indeksu: ");
        id = w.nextInt();
        tab1[id].setImie("");
        tab1[id].setNazwisko("");
        tab1[id].setNazwaSpecjalnosci("");
        tab1[id].setRok_studiow(id);
        System.out.println("\nStudent o podanym indeksie zostal usuniety!");
    }

    private void wyswietlInd() {
        Scanner w = new Scanner(System.in);
        int id;
        System.out.println("\nPodaj numer indeksu");
        id = w.nextInt();
        tab1[id].pokazDane();
    }

    private void wyswietlAll() {
        for (int i = 0; i < 100; i++) {
            System.out.println("");
            tab1[i].pokazDane();
        }
    }

    private void wyswietlZakres() {
        int pocz, kon;
        Scanner w = new Scanner(System.in);
        System.out.print("\nPodaj poczatkowy indeks tablicy: ");
        pocz = w.nextInt();
        System.out.println("\nPodaj koncowy indeks tablicy: ");
        kon = w.nextInt();

        for (int i = pocz; i < kon; i++) {
            System.out.println("");
            tab1[i].pokazDane();

        }
    }
}
