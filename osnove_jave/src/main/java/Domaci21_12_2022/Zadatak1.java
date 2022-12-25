package Domaci21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

 // .Zadatak
        //Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni)
        // i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
        //Primer:
        //Unesite pozicjiu od 0 do 9: 3
        //Unesite novu vrednost: 11
        //Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu

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
