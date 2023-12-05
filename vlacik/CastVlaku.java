import fri.shapesge.Obrazok;

public class CastVlaku {
    private static final int VELKOST_POLICKA = 35;
    
    private Poloha poloha;
    private final Obrazok obrazok;
    
    public CastVlaku(Poloha poloha, TypCastiVlaku typ) {
        this.poloha = poloha;
        this.obrazok = new Obrazok(
            typ.getSuborObrazka(),
            poloha.getX() * CastVlaku.VELKOST_POLICKA,
            poloha.getY() * CastVlaku.VELKOST_POLICKA
        );
        this.obrazok.zmenUhol(poloha.getSmer().getUhol());
        this.obrazok.zobraz();
    }
    
    public Poloha getPoloha() {
        return this.poloha;
    }
    
    public void setPoloha(Poloha poloha) {
        this.poloha = poloha;
        this.obrazok.zmenPolohu(
            poloha.getX() * CastVlaku.VELKOST_POLICKA,
            poloha.getY() * CastVlaku.VELKOST_POLICKA
        );
        this.obrazok.zmenUhol(poloha.getSmer().getUhol());
    }
}
