public class Turnaj {
    private Tim[] prihlaseneTimy;
    private Vysledok[][] tabulka;
    private boolean uzavrety;
    
    public Turnaj(String[] timy, ZoznamTimov liga) {
        this.prihlaseneTimy = new Tim[timy.length];
        
        for (int i = 0; i < timy.length; i++) {
            this.prihlaseneTimy[i] = liga.getTim(timy[i]);
        }
        
        this.tabulka = new Vysledok[timy.length][timy.length];
        
        for (int y = 0; y < timy.length; y++) {
            for (int x = 0; x < timy.length; x++) {
                if (y == x) {
                    this.tabulka[y][x] = Vysledok.NEHRA_SA;
                } else {
                    this.tabulka[y][x] = Vysledok.NEDOHRANE;
                }
            }
        }
        
        this.uzavrety = false;
    }
}
