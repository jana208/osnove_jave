package p19_12_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

     // Napisati program koji od korisnika ucitava N brojeva  i ispisuje sumu tih brojeva. N nam kaze koliko broja ce korisnik da unese.
        //Primer izvrsenja:
        //Unesite N: 3
        //Unesite broj: 1
        //Unesite broj: 4
        //Unesite broj: 9
        //Suma je 14.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesi N: ");
        int n = s.nextInt();



        for (int i = 0; i < n; i++) {
            System.out.println("Unesi broj: ");
            int broj = s.nextInt();


            System.out.println("Uneli smo broj" + broj);
        }












    }
}
