public class Ruka {
    private int aktGesto;
    private Obrazok obrGesto;
    
    public Ruka(int suradnicaX, int suradnicaY, int cisloGesta) {
        if (cisloGesta >= 0 && cisloGesta <= 4) {
            this.aktGesto = cisloGesta;
        } else {
            this.aktGesto = 0;
        }
        
        switch (this.aktGesto) {
            case 0:
                this.obrGesto = new Obrazok("pics/rock.png");
                break;
            case 1:
                this.obrGesto = new Obrazok("pics/paper.png");
                break;
            case 2:
                this.obrGesto = new Obrazok("pics/scissors.png");
                break;
            case 3:
                this.obrGesto = new Obrazok("pics/lizard.png");
                break;
            case 4:
                this.obrGesto = new Obrazok("pics/spock.png");
                break;
        }
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
        switch (cislo) {
            case 0:
                this.obrGesto.zmenObrazok("pics/rock.png");
                break;
            case 1:
                this.obrGesto.zmenObrazok("pics/paper.png");
                break;
            case 2:
                this.obrGesto.zmenObrazok("pics/scissors.png");
                break;
            case 3:
                this.obrGesto.zmenObrazok("pics/lizard.png");
                break;
            case 4:
                this.obrGesto.zmenObrazok("pics/spock.png");
                break;
        }
    }
    
    public void setNasledujuceGesto() {
        this.aktGesto = (this.aktGesto + 1) % 5;
        switch (this.aktGesto) {
            case 0:
                this.obrGesto.zmenObrazok("pics/rock.png");
                break;
            case 1:
                this.obrGesto.zmenObrazok("pics/paper.png");
                break;
            case 2:
                this.obrGesto.zmenObrazok("pics/scissors.png");
                break;
            case 3:
                this.obrGesto.zmenObrazok("pics/lizard.png");
                break;
            case 4:
                this.obrGesto.zmenObrazok("pics/spock.png");
                break;
        }
    }
    
    public void setPredchadzajuceGesto() {
        // this.aktGesto = (this.aktGesto + 4) % 5;
        this.aktGesto--;
        if (this.aktGesto < 0) {
            this.aktGesto = 4;
        }
        
        switch (this.aktGesto) {
            case 0:
                this.obrGesto.zmenObrazok("pics/rock.png");
                break;
            case 1:
                this.obrGesto.zmenObrazok("pics/paper.png");
                break;
            case 2:
                this.obrGesto.zmenObrazok("pics/scissors.png");
                break;
            case 3:
                this.obrGesto.zmenObrazok("pics/lizard.png");
                break;
            case 4:
                this.obrGesto.zmenObrazok("pics/spock.png");
                break;
        }
    }
}
