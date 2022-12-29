package Domaci27_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {

         //Kreirati klasu SmartAirConditioning koja ima:
        //atribut za marku klime (npr: Samsung, Galanz, Gree, …)
        //atribut za izabranu temperaturu
        //atribut za mod (hladi/greje) - string
        //metodu za stampu (proizvoljno)
        //metodu koja vraca informaciju da li je napolju veca temperatura
        // od one na koju je klima postavljena. Metoda kao parametar prima temperaturu koja je napolju.


   SmartAirConditioning x = new SmartAirConditioning();
   x.marka = "Samsung";
   x.izabranaTemperatura = 22.5;
   x.mod = "greje";
   x.stampaj();

   if (x.izabranaTemperatura(23)) {
       System.out.println("Temperatura napolju je veca od one na koju je klima postavljena.");
   }




    }
}
