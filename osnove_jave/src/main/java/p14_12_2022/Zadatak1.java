package p14_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

  // Napisati program koji sa tastature ucitava ime, prezime, broj telefona, email  i jmbg korisnika prikazuje u formatu:
        //[Ime] [Prezime] - [JMBG]
        //Broj Tel: [Broj telefona],
        //Email: [Email],

        System.out.println("Unesi ime:");
        String ime = s.next ();
        System.out.println("Unesi prezime: ");
        String prezime = s.next ();
        System.out.println("Unesi jmbg: ");
        String jmbg = s.next();
        System.out.println("Unesi brojTelefona: ");
        String brojTelefona = s.next();
        System.out.println("Unesi email: ");
        String email = s.next();

        System.out.println(ime + " " + prezime + " - " + jmbg);
        System.out.println("Broj telefona: " + brojTelefona);
        System.out.println("Email: " + email);





    }
}
