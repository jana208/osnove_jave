package p_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

//  Napisati program koji u sebi ima definisan niz
//  od 5 broja (brojevi su proizvoljni) i racuna
//  i stampa sumu svih brojeva niza.
//Primer: Ako je niz 1,2,4,5,7
//Stampa se, suma = 19

        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        Scanner s = new Scanner(System.in);

        int suma = 0;

        brojevi.add(1);
        brojevi.add(3);
        brojevi.add(5);
        brojevi.add(7);
        brojevi.add(9);

        for (int i = 0; i <= 5; i++) {
            suma = suma + brojevi.get(i);

        } System.out.println("Suma je" + suma);















    }
}
