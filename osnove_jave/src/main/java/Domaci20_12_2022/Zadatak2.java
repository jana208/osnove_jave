package Domaci20_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

  // Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..
  // Primer izvrsenja:
        //Unesite rimski broj: X
        //Arapski: 10
        //Unesite rimski broj: C
        //Arapski: 50
        //Unesite rimski broj: D
        //Arapski: 500
        //Unesite rimski broj: M
        //Arapski: 1000
        //Unesite rimski broj: I
        //Arapski: 1
        //Unesite rimski broj: KRAJ
        //Kraj programa.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesi broj: ");
        int X = 0;
        int C = 0;
        int D = 0;
        int M = 0;
        int I = 0;
        int broj = s.nextInt();

        while (broj != 0) {
            if ( broj == X ) {
                System.out.println(10);
                else if (broj == C);
                System.out.println(50);
            else if (broj == D);
                System.out.println(500);
            else if (broj == M);
                 System.out.println(1000);
            else if (broj == 1);
                 System.out.println(1);
        }
        System.out.println("Program je gotov.");

















    }
}}
