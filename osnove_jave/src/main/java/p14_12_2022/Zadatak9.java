package p14_12_2022;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        // Napisati program koji simulira ponasanje kontrole za zvuk na jutjubu.. Kada se ucita video difoltna jacina zvuka je 75.
        //Korisnik unosi akciju sa tastature. Jednu od sledecih:
        //pojacaj - pojacava zvuka za 10
        //smanji - smanjuje zvuk za 10.
        //mute - postavlja zvuk na 0.
        //Na kraju programa odstampati jacinu zvuka
        //Primer izvrsenja 1:
        //Jacina zvuka je 75.
        //Unesite akciju: pojacaj
        //Nova jacina zvuka je 85

        Scanner s = new Scanner(System.in);

        int jacinaZvuka = 75;

        System.out.println("Pojacaj: ");
        String pojacaj = s.next();

        System.out.println("Smanji: ");
        String smanji = s.next();

        System.out.println("Mute: ");
        String mute = s.next();

        System.out.println("Unesi akciju: ");
        String akcija = s.next();


        if (akcija.equals("pojacaj")) {
            jacinaZvuka = jacinaZvuka + 10;
        } else if (akcija.equals("smanji")) {
            jacinaZvuka = jacinaZvuka - 10;
        } else if (akcija.equals("mute")) {
            jacinaZvuka = 0;
    }
         System.out.println("Nova jacina zvuka je: " + jacinaZvuka);
        }



















    }

