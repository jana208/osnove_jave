package p29_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {

// Kreirati klasu Student koja ima:
//ime
//prezime
//broj indeksa (int)
//da li je na budzetu
//gettere i settere za sve atributge

        Student x = new Student();
        x.setIme("Jana");
        x.setPrezime("Antic");
        x.setBrojIndeksa(2456);
        x.setBudzet(true);


       System.out.println("Ime " + x.getIme());
       System.out.println("Prezime: " + x.getPrezime());
       System.out.println("Broj indeksa: " + x.getBrojIndeksa());
       System.out.println("Budzet: " + x.getBudzet());





    }
}
