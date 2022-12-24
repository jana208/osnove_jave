package p20_12_2022;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Zadatak4 {
    public static void main(String[] args) {

// Napisati program koji radi bipovanje ruznih reci. Program radi za jednu recenicu, sto znaci da ucitava od korisnika rec po rec sve dok se ne unese rec sa tackom. Za reci koje su nepristojne ispisuje beeeeeeeeeeeeep.
//Ruzne reci koje program prepoznaje su:
//zajebava
//mars
//stoko
//svinjo
//Unesite rec: Jel
//Jel
//Unesite rec:ti
//ti
//Unesite rec:to
//to
//Unesite rec:mene
//mene
//Unesite rec:zajebavas
//beeeeeeeeeep
//Unesite rec:stoko
//beeeeeeeeeep
//Unesite rec:jedna.
//jedna.
//Kraj programa.

        Scanner s = new Scanner(System.in);

        String zajebava = "zajebavas";
        String mars = "mars";
        String stoko = "stoko";
        String svinjo = "svinjo";
        String rec = "";

        while (rec.equals("")) {
            System.out.println("Je l ti to ");
            rec = s.next();

            if (rec.equals(zajebava)) ;
            {
                System.out.println("Beeeeeeeeeep");
            }
            if (rec.equals(mars)) ;
            {
                System.out.println("Beeeeeeeeeeep");
            }
            if (rec.equals(svinjo)) ;
        }
        System.out.println("Beeeeeeeeeeeeep");
        if (rec.equals(stoko)) ;
        System.out.println("Beeeeeeeeeeep");


    }



}
