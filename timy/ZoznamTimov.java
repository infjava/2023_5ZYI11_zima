import java.util.ArrayList;

public class ZoznamTimov {
    private ArrayList<Tim> zoznamTimov;
    
    public ZoznamTimov() {
        this.zoznamTimov = new ArrayList<Tim>();
    }
    
    public boolean pridajTim(Tim pridavany) {
        if (this.getTim(pridavany.getNazovTimu()) == null) {
            this.zoznamTimov.add(pridavany);
            
            return true;
        }
        
        return false;
    }
    
    public Tim getTim(String nazovHladaneho) {
        for (Tim tim : this.zoznamTimov) {
            if (tim.getNazovTimu().equals(nazovHladaneho)) {
                return tim;
            }
        }
        
        return null;
    }
    
    public void vynulujVysledky() {
        for (Tim tim : this.zoznamTimov) {
            tim.vynulujBody();
        }
    }
}
