package p19_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

   //   Napisati program koji pronalazi K-ti stepen broja N.
        //   Koristeci FOR petlju
        //K i N unosi korisnik.
        //Primer izvrsenja:
        //Unesite K: 7
        //Unesite N: 2
        //Rezultat 128

       // p = 2 * 2 * 2 * 2 * 2 * 2 * 2
        // P = P * 2
        //

        int p = 1;

        for (int i = 0; i < 7; i++) {
            p = p * 2;
        }
        System.out.println("stepen je " + p);













    } }


