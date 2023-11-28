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
    
    public void vypisTabulky() {
        System.out.format("%25s", "");
        for (Tim timHosti : this.prihlaseneTimy) {
            System.out.format("%25s", timHosti.getNazovTimu());
        }
        System.out.println();
        
        for (int domaci = 0; domaci < this.prihlaseneTimy.length; domaci++) {
            System.out.format("%25s", this.prihlaseneTimy[domaci].getNazovTimu());
            
            for (int hostia = 0; hostia < this.prihlaseneTimy.length; hostia++) {
                System.out.format("%25s", this.tabulka[domaci][hostia]);
            }
            System.out.println();
        }
    }
}
