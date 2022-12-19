package p16_12_2022;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

  //   Napisati program koji simulira stampanje ocitane licne karte u vise primeraka. Korisnik unosi podatke :
        //ime
        //prezime
        //jmbg
        //broj primeraka za stampu
        //Primer izvrsenja:
        //Unesite ime: Milan
        //Unesite prezime: Jovanovic
        //Unesite jmbg: 2109238932232
        //Unesite broj primeraka za stampu: 3
        //
        //
        //
        //
        //
        //
        //Primerak 1
        //**********************************
        //Ime i prezime: Milan Jovanovic
        //JMBG: 2109238932232
        //**********************************
        //
        //Primerak 2
        //**********************************
        //Ime i prezime: Milan Jovanovic
        //JMBG: 2109238932232
        //**********************************
        //
        //Primerak 3
        //**********************************
        //Ime i prezime: Milan Jovanovic
        //JMBG: 2109238932232
        //**********************************


      Scanner s = new Scanner(System.in);

        System.out.println("Unesi ime: ");
        String ime = s.next();
        System.out.println("Unesi prezime: ");
        String prezime = s.next();
        System.out.println("Unesi jmbg: ");
        String jmbg = s.next();
        System.out.println("Unesi brojPrimeraka: ");
        String brojPrimeraka = s.next();


        for (int i = 0; i < brojPrimeraka ; i++) {

       System.out.println("Primerak " + (i+1));
       System.out.println("**********************************");
       System.out.println("Ime i prezime: Jana Antic" + ime + "" + prezime);
       System.out.println("jmbg: 2109238932232" + jmbg);
            System.out.println("**********************************");
        }
        













































    }
}
