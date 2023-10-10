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
    
    public void faktorial() {
        double medzivysledok = 1;
        for (int i = 1; i <= this.vysledok; i++) {
            medzivysledok *= i;
        }
        /*int i = 1;
        while (i <= this.vysledok) {
            medzivysledok *= i;
            i++;
        }*/
        /*for (int i = (int)this.vysledok; i >= 1; i--) {
            medzivysledok *= i;
        }*/
        this.vysledok = medzivysledok;
    }
    
    public double getVysledok() {
        return this.vysledok;
    }
}
