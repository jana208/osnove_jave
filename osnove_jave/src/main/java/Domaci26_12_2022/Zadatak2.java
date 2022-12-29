package Domaci26_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

 //  Napisati metodu koja vrsi spajanje punog imena i vraca tu vrednost.
        //  Metoda od parametara prima ime i prezime (2 parametra)
        //  i vraca jedan string tako sto spoji ime i prezime. METODA NISTA NE STAMPA.
        //Primer poziva: Ako se metoda pozvoe za ime=”Milan” i prezime=”Jovanovic”, metoda vraca “Milan Jovanovic”

  Scanner s = new Scanner(System.in);
  System.out.println("Unesi n: ");
  int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            ime();
            System.out.println("ime()+" + "+prezime()");
            prezime();
        }


    }

    public static void ime() {
        System.out.println("Jana");

    }

    public static void prezime() {
        System.out.println("Antic");


    }
}










