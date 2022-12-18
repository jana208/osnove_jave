package Domaci13_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {

        // Napisati program koji stampa podatke o kreditnoj kartici u formatu kao na slici.
        // Od informacija se pamti broj kartice (16 cifara sa razmacima),
        // mesec i godina do kada vazi kartica, kao i ime i prezime vlasnika kartice.
        // Kartica se stampa sa zvezdicama i ne brinite ukoliko neka zvezdica mrdne
        // i nije u liniji to ce zavisiti od duzine imena.
        //Napomena: svaka informacija mora da bude u okviru posebne promenljive.


        String kreditnaKartica = "Credit card";
        String brojKartice = "1111 1111 1111 1111";
        String mesecIGodina = "valid > 1 / 1";
        String imeIPrezime = "John Smith";

        System.out.println("* * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("* " + kreditnaKartica + "   "       +     " *");
        System.out.println("* " + "" + "****" + "       "       +      " *");
        System.out.println("* " + "" + "****" + "       "       +      " *");
        System.out.println("* "  + brojKartice + "       "      +       " *");
        System.out.println("* "  + "                " + mesecIGodina +  " *");
        System.out.println("* " + imeIPrezime + "                " + "  " * ");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");










    }
}
