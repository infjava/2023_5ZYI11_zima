public class Tim {
    private String nazov;
    private Krajina povod;
    private int pocetBodov;
    
    public Tim(String nazov, Krajina povod) {
        this.nazov = nazov;
        this.povod = povod;
        this.pocetBodov = 0;
    }

    public String getNazovTimu() {
        return this.nazov;
    }
    
    public Krajina getKrajinaPovodu() {
        return this.povod;
    }
    
    public int getPocetBodov() {
        return this.pocetBodov;
    }
    
    public void pridajBody(int kolko) {
        this.pocetBodov += kolko;
    }
    
    public void vynulujBody() {
        this.pocetBodov = 0;
    }
}
