package p14_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        // Napisati program koji sa tastature ucitava tri cela broja:
        //dan
        //mesec
        //godina
        //	I formira datum u ispisu u formatu dan-mesec-godina

        System.out.println("Unesi dan: ");
        int dan = s.nextInt();
        System.out.println("Unesi mesec: ");
        int mesec = s.nextInt();
        System.out.println("Unesi godinu: ");
        int godina = s.nextInt();
        System.out.println(dan + " - " + mesec + " - " + godina);


    }
}
