package Domaci19_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        //   Napisati program koji od korisnika ucitava N brojeva i sabira samo parne brojeve. Na kraju programa prikazati sumu.
        //Primer izvrsenja:
        //Unesite N: 5
        //Unesite broj: 1
        //Unesite broj: 2
        //Unesite broj: 9
        //Unesite broj: 6
        //Unesite broj: 8
        //Suma parnih brojeva je 16
        //Objasnjenje: 2 + 6 + 8 = 16


        Scanner s = new Scanner(System.in);

        System.out.println("Unesi N: ");
        int n = s.nextInt();
        int suma = 0;


        for (int i = 0; i < n; i++) {
            System.out.println("Unesi broj: ");
            int broj = s.nextInt();
            if (broj % 2 == 0) {
                broj = broj + 1;
                broj++;

            }

            System.out.println("broj: " + suma);
        }


    }
}