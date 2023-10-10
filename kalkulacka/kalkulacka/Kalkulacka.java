public class Kalkulacka {
    private double vysledok;
    private char operacia;
    
    public Kalkulacka() {
        this.vysledok = 0;
        this.operacia = '+';
    }
    
    public void zadajCislo(double cislo) {
        switch (this.operacia) {
            case '+':
                this.vysledok += cislo;
                break;
            case '-':
                this.vysledok -= cislo;
                break;
            case '*':
                this.vysledok *= cislo;
                break;
            case '/':
                this.vysledok /= cislo;
                break;
        }
    }
    
    public void scitaj() {
        this.operacia = '+';
    }
    
    public void odcitaj() {
        this.operacia = '-';
    }
    
    public void vynasob() {
        this.operacia = '*';
    }
    
    public void vydel() {
        this.operacia = '/';
    }
    
    public void druhaMocnina() {
        this.vysledok *= this.vysledok;
    }
    
    public double getVysledok() {
        return this.vysledok;
    }
}
