package Domaci27_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {

  //  Napisati klasu Proizvod koja ima atribute
        //naziv proizvoda (String)
        //cenu proizvoda (double)
        //težinu proizvoda u gramima. (double)
        //	i metode:
        //stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
        //konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo, a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
        //Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
        //Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
        //U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode

       Proizvod x = new Proizvod();
       x.nazivProizvoda = "Secer";
       x.cenaProizvoda = 100;
       x.tezinaProizvoda = 1000;

       System.out.println(x.nazivProizvoda + " " + x.cenaProizvoda + " " + x.tezinaProizvoda);

       Proizvod y = new Proizvod();
       y.nazivProizvoda = "So";
       y.cenaProizvoda = 80.25;
       y.tezinaProizvoda = 200.5;

       System.out.println(y.nazivProizvoda + " " + y.cenaProizvoda + " " + y.tezinaProizvoda);















    }
}
