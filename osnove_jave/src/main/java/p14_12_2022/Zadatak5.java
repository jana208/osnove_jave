package p14_12_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    //Napisati program koji ucitava brojeve a, b i c sa tastature i proverava da li je broj a u opsegu od b do c.
        // Primer izvrsenja:
        //Unesite b: 5
        //Uneiste c: 50
        //Unesite a: 15
        //A je u opstegu izmedju 5 i 50


        System.out.println("Unesi a: ");
        int a = s.nextInt();

        System.out.println("Unesi b: ");
        int b = s.nextInt();

        System.out.println("Unesi c: ");
        int c = s.nextInt();

        if (a <= b && a<= c ) {
            System.out.println("a je u opsegu ");
        } else {
            System.out.println("a nije u opsegu");
        }
















    }
}
