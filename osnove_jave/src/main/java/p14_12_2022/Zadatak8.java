package p14_12_2022;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {

        // Napisati program koji ucitava broj a i ispisuje poruke:
        //Ukoliko je broj a do 10 stampamo da je jednocifren broj
        //Ukoliko je broj a do 100 stampamo da je dvocifren broj
        //Ukoliko je broj a veci od 100 stampamo da je trocifren.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesi a: ");
        int a = s.nextInt();

        if (a < 10) {
            System.out.println("A je jednocifren broj.");
        } else if (a < 100) {
            System.out.println("A je dvocifren broj.");
        } else {
           System.out.println("A je trocifren broj.");

        }
























    }
}
