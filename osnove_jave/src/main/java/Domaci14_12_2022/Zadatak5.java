package Domaci14_12_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        //  Napisati program koji u zavisnosti od operatora koji unosi korisnik sa tastature
        //  (operator je string i moze imati vrednosti +, - , *, /)
        //  racuna  i ispisuje na ekranu odgovarajuci zbir, razliku,
        //  proizvod ili kolicnik za dva broja a i b uneta sa tastature.
        // Primer 1:
        //Unestite a: 6
        //Unesite b: 3
        //Unesite operator: +
        //Rezultat: 9

       Scanner s = new Scanner(System.in);

       System.out.println("Unesi a: ");
       int a = s.nextInt();
       System.out.print("Unesi b: ");
       int b = s.nextInt();

        System.out.println("Unesi +: ");
        String + = s.next();
        System.out.println("Unesi -: ");
        String - = s.next();
        System.out.println("Unesi *: ");
        String * = s.next();
        System.out.println("Unesi /: ");
        String / = s.next();

        System.out.println (a + " - " + b =);






















    }
}
