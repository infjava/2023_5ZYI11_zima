public class DvojcifereneCislo {
    private Cislica desiatky;
    private Cislica jednotky;
    
    public DvojcifereneCislo() {
        this.desiatky = new Cislica(0, 0);
        this.jednotky = new Cislica(65, 0);
    }
    
    public void zobraz(int cislo) {
        this.desiatky.zobraz(cislo / 10);
        this.jednotky.zobraz(cislo % 10);
    }
}
