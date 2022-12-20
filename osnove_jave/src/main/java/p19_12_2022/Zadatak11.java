package p19_12_2022;

import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {

  //  Napisati program koji uneti password sakriva.
        //Primer izvrsenja:
        //Unestite password: OvoJePassword123
        //Skriverni password: ****************

        Scanner s = new Scanner(System.in);
        System.out.println("Unesi password: ");
        String password = s.next();

        for (int i = 0; i < password.length() ; i++) {
            System.out.println("*");
        }
















    }
}
