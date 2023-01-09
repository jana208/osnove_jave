package Domaci29_12_2022;

public class FacebookPost {

    private String imeIPrezime1;
    private String imeIPrezime2;
    private String tekst;
    private int lajkovi;
    private int deljenja;

    public String getImeIPrezime1() {
        return this.imeIPrezime1;
    }

    public void setImeIPrezime1(String imeIPrezime1) {
        this.imeIPrezime1 = imeIPrezime1;
    }

    public String getImeIPrezime2() {
        return this.imeIPrezime2;
    }

    public void setImeIPrezime2(String imeIPrezime2) { this.imeIPrezime2 = imeIPrezime2; }

    public String getTekst() {
        return this.tekst;
    }

    public void setTekst(String tekst) {  this.tekst = tekst; }

    public int getLajkovi() { return this.lajkovi; }

    public int getDeljenja() { return this.deljenja; }

    public void like(int lajkovi) {
        this.lajkovi = this.lajkovi + 1;
    }

    public void dislike(int lajkovi) {
        this.lajkovi = this.lajkovi - 1;
    }

    public void share (int deljenja) {
        this.deljenja = this.deljenja + 1;
    }

    public void stampaj() {
        System.out.println(this.imeIPrezime1 + " >>>> " + this.imeIPrezime2);
        System.out.println(this.tekst);
        System.out.println("Likes " + this.lajkovi + "|" "Shares " + this.deljenja);
    }




















    }




















