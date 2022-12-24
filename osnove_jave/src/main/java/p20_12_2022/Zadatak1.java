package p20_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {


  //   Zadatak
        //Napisati program koji validira unos input polja za broj. Polje za unos prima samo brojeve u opsegu od 10 do 50.Korisnik unosi vrednosti dok ne unese validan  broj.
        //Primer izvrsenja:
        //Unesite broj: 5
        //Greska: Broj nije u opsegu od 10 do 50.
        //Unesite broj: -1
        //Greska: Broj nije u opsegu od 10 do 50.
        //Unesite broj: 51
        //Greska: Broj nije u opsegu od 10 do 50.
        //Unesite broj: 40
        //Broj je validan, kraj programa.



        Scanner s = new Scanner(System.in);
        int broj = 9;

        while (10 < broj || broj > 50) {
            System.out.println("Unesite broj: ");
            broj = s.nextInt();

            System.out.println("Greska, broj nije u opsegu od 10 do 50.");

        }
        System.out.println("Broj je validan, kraj programa. ");









    }
}
