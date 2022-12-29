package Domaci27_12_2022;

public class SmartAirConditioning {
    public String marka;
    public double izabranaTemperatura;
    public String mod;

    public void stampaj() {
        System.out.println(this.marka + ", " + this.izabranaTemperatura + ", " + this.mod);
    }

    public boolean izabranaTemperatura(int temperaturaNapolju) {
        return this.izabranaTemperatura > temperaturaNapolju;


    }



}