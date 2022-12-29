package p_21_12_2022;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {

  // Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni)
        // i prikazuje sumu nultog i zadnjeg elementa tog niza.

        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        brojevi.add(1);
        brojevi.add(3);
        brojevi.add(7);
        brojevi.add(9);
        brojevi.add(11);

        int lastIndex = brojevi.size() - 1;
        int suma = brojevi.get(0) +brojevi.get(lastIndex);

        System.out.println("Suma " + suma);












    }
}
