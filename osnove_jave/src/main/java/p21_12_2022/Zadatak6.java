package p_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

 //   Napisati progam koji stampa niz u obrnutom redosledu tj. od zadnjeg elementa do nultog.
        //Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1

        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        Scanner s = new Scanner(System.in);

        brojevi.add(1);
        brojevi.add(3);
        brojevi.add(5);
        brojevi.add(7);
        brojevi.add(9);

        for (int i = brojevi.size() - 1; i > 0; i--) {
           System.out.println(brojevi.get(i) + ", ");
        }















    }
}
