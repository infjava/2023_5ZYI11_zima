public class Ruka {
    private int aktGesto;
    private Obrazok obrGesto;
    
    public Ruka(int suradnicaX, int suradnicaY, int cisloGesta) {
        if (cisloGesta >= 0 && cisloGesta <= 4) {
            this.aktGesto = cisloGesta;
        } else {
            this.aktGesto = 0;
        }
        
        this.obrGesto = new Obrazok("pics/" + this.getNazovGesta() + ".png");
        this.obrGesto.zmenPolohu(suradnicaX, suradnicaY);
        this.obrGesto.zobraz();
    }
    
    public String getNazovGesta() {
        switch (this.aktGesto) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            case 3:
                return "lizard";
            case 4:
                return "spock";
            default:
                return null;
        }
    }
    
    public void setGesto(int cislo) {
        this.aktGesto = cislo;
        
        this.ukazGesto();
    }
    
    public void setNasledujuceGesto() {
        this.aktGesto = (this.aktGesto + 1) % 5;
        
        this.ukazGesto();
    }
    
    public void setPredchadzajuceGesto() {
        // this.aktGesto = (this.aktGesto + 4) % 5;
        this.aktGesto--;
        if (this.aktGesto < 0) {
            this.aktGesto = 4;
        }
        
        this.ukazGesto();
    }
    
    private void ukazGesto() {
        this.obrGesto.zmenObrazok("pics/" + this.getNazovGesta() + ".png");
    }
}
