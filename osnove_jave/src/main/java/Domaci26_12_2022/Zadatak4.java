package Domaci26_12_2022;

public class Zadatak4 {
    public static void main(String[] args) {
        // Napisati metodu koja stampa podatke o korisniku u formatu:
        //JMBG: [jmbg]
        //Ime: [ime]
        //Prezime: [prezime]
        //God. rodjenja: [god]
        //Aktivan: [true/false]
        //Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.

        stampajKorisnika(200000 , "Jana","Antic",2000,true );
    }
     public static void stampajKorisnika(int JMBG, String ime, String prezime, int godinaRodjenja, boolean aktivan) {
        System.out.println("Jmbg: " + JMBG);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("Godina rodjenja: " + godinaRodjenja);
        System.out.println("Aktivan: " + aktivan);













    }
}
