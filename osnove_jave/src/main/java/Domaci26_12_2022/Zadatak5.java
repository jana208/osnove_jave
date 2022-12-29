package Domaci26_12_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        // Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
        //Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
        /// / / / /
        //Napomena: Metoda nista ne vraca.
        Scanner s =new Scanner(System.in);
        System.out.println("Unesi n: ");
        int n = s.nextInt();
        stampajKosaCrta(5, "/");
    }
       public static void stampajKosaCrta(int n, String karakter) {
           for (int i = 0; i < n; i++) {
               System.out.println(karakter + " ");
           }

















    }
}
