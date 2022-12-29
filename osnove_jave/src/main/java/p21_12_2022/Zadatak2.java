package p_21_12_2022;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {

 //  Napisati program koji u sebi ima definisan niz
        //  od 5 broja (brojevi su proizvoljni)
        //  i menja vrednost elementa na poziciji 3
        //  tako sto je povecava 10 puta.


        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        brojevi.add(1);
        brojevi.add(3);
        brojevi.add(5);
        brojevi.add(7);
        brojevi.add(9);

        int x = brojevi.get(3) * 10;
        brojevi.set(3, x);

















    }
}
