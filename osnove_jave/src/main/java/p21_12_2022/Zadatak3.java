package p_21_12_2022;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {

     // Napisati program koji u sebi ima definisan
        // niz od 5 broja (brojevi su proizvoljni)
        // i koji zamenjuje vrednosti prvog (na poziciji nula)
        // i zadnjeg elemnta niza.

        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        brojevi.add(1);
        brojevi.add(3);
        brojevi.add(5);
        brojevi.add(7);
        brojevi.add(9);
       int staraVrednostSaNulte = brojevi.get(0);
       brojevi.set(0, brojevi.get(4));
       brojevi.set(4, staraVrednostSaNulte);












    }
}
