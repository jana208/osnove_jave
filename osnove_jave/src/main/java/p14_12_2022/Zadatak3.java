package p14_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

  //      Napisati program koji sa tastature ucitava tri broja a, b i c
        //      i ispisuje srednju vrednost za ta tri broja.
        //      Sve promenljive u programu su po tipu double.

        System.out.println("Unesi a: ");
        double a = s.nextDouble();
        System.out.println("Unesi b: ");
        double b = s.nextDouble();
        System.out.println("Unesi c: ");
        double c = s.nextDouble();
        System.out.println("Unesi avg: ");

        double avg = (a + b + c) / 3;
        System.out.println("Srednja vrednost: " + avg);









    }
}
