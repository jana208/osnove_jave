package Domaci20_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

  // Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
        //Primer izvrsenja 1:
        //Unesite broj:1
        //Unesite broj:2
        //Unesite broj:0
        //Unesite broj:2
        //Kraj programa.
        //(Objasnjenje: Kraj jer je uneto dve dvojke)
        //
        //Primer izvrsenja 1:
        //Unesite broj:1
        //Unesite broj:2
        //Unesite broj:1
        //Unesite broj:3
        //Unesite broj:1
        //Kraj programa.
        //(Objasnjenje: Kraj jer je uneto tri jedinice)


        Scanner s = new Scanner(System.in);
        int broj = 1;
        int nule = 0;
        while (broj != 0 || nule<2){
            System.out.println("Unesi broj: ");
            broj = s.nextInt();
        if (broj == 0){
            nule++;
        }
        }
        System.out.println("Kraj programa. ");

















    }
}
