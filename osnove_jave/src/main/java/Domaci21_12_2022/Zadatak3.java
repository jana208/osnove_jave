package Domaci21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

 //  Napisati program koji ucitava niz A duzine N, i koji nakon unosa niz A stampa sve elemente niza koji su veci od nule.
        //Primer izvrsenja:
        //Unesite N: 5
        //Unesite broj: 1
        //Unesite broj: -4
        //Unesite broj: 3
        //Unesite broj: -7
        //Unesite broj: 9
        //
        //Brojevi veci od nule u nizu A su: 1, 3, 9,

        ArrayList<Integer> niz = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        System.out.println("Unesi n:" );
        int n = s.nextInt();
        ArrayList<Integer> nizPozitivnih = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            System.out.println("Unesi broj: ");
            int broj = s.nextInt();
            niz.add(broj);
            if (broj > 0) {
                nizPozitivnih.add(broj);
            }
        }
        System.out.println("Brojevi veci od 0 u nizu a su " + nizPozitivnih);















    }
}
