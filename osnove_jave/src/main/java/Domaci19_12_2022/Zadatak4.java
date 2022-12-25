package Domaci19_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

 //   Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija. Korisnik unosi N rekacija zatim se prikazuje evidencija:
        //Program podrzava sledece reakcije:
        //like
        //smile
        //heart
        //
        //	Primer izvrsenja:
        //Unesite N: 7
        //	Reaguj: like
        //	Reaguj: heart
        //	Reaguj: smile
        //	Reaguj: lol
        //	Reaguj: smile
        //	Reaguj: like
        //	Reaguj: like
        //Summary: like 3 | smile 2 | heart 1

        Scanner s = new Scanner(System.in);

        System.out.println("Unesi N: ");
        int n = s.nextInt();
        int brojac = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesi reakcija");
            String reakcija = s.nextInt();
            brojac = reakcija + 1;

        }
        System.out.println("Ukupno ima " + brojac + "reakcija" );





















    }
}
