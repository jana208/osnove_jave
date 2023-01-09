package Domaci29_12_2022;

public class Proizvod {

    public String naziv;
    public double cena;
    public double tezina;

    public void stampaj() {
        System.out.println(this.naziv + ", " + this.cena + ", " + this.tezina);

    }

    public void povecajCenu(int povecanje) {
        this.cena = this.cena + povecanje;
    }

    public double cenaSaPopustom(double popust) {
        double cenaSaPopustom = this.cena - popust;
        return cenaSaPopustom;
    }

    public int racunajPostarinu() {
        if (this.tezina <= 100) {
            return 200;
        } else if (tezina < 500) {
            return 400;
        } else if (this.tezina > 500) {
            return 1000;
        }


    }
}