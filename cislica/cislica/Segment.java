public class Segment {
    private Obdlznik obdlznik;
    
    public Segment(int x, int y, boolean jeVertikalny) {
        this.obdlznik = new Obdlznik();
        
        this.obdlznik.posunVodorovne(x - 60);
        this.obdlznik.posunZvisle(y - 50);
        
        if (jeVertikalny) {
            this.obdlznik.zmenStrany(5, 50);
        } else {
            this.obdlznik.zmenStrany(50, 5);
        }
    }
    
    public void zapni() {
        this.obdlznik.zobraz();
    }
    
    public void vypni() {
        this.obdlznik.skry();
    }
}
