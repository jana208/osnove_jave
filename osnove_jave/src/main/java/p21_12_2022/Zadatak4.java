package p_21_12_2022;

import java.awt.image.Kernel;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

  //  Napisati program koji u sebi ima definisan niz
        //  od 5 broja (brojevi su proizvoljni)
        //  i koji prikazuje element na poziciji K.
        //  K unosi korisnik i smatrajte da unosi u opsegu
        //  od 0 do 4.
        //Primer:
        //Unesite pozicjiu: 2
        //Na pozicji 2 je vrednost 7.

        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        Scanner s = new Scanner(System.in);
        System.out.println("Unesi K: ");
        int K = s.nextInt();


        brojevi.add(1);
        brojevi.add(3);
        brojevi.add(5);
        brojevi.add(7);
        brojevi.add(9);

        System.out.println("Vrednost je: " + brojevi.get(K));









    }
}
