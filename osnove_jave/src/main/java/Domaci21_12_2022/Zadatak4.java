package Domaci21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

  //  Napisati program koji ucitava niz A duzine N i broj X.
        //  Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.
        //	Primer izvrsenja:
        //Unesite N: 5
        //Unesite broj: 1
        //Unesite broj: 3
        //Unesite broj: 7
        //Unesite broj: 3
        //Unesite broj: 9
        //Unesite X: 3
        //
        //Rezultat: Elementi niza A koji su jednaki broju X imaju indekse:
        //1, 3

        ArrayList<Integer> niz = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        System.out.println("Unesi n:" );
        int n = s.nextInt();
        int x = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesi broj: ");
            int broj = s.nextInt();
            niz.add(broj);
            if (niz.get(i) == x);

        }
        System.out.println("");
















    }
}
