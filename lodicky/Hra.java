import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Hra {
    private Policko[][] hraciaPlocha;
    private Lodka[] lodky;
    
    public Hra(int velkostPolicka, String nazovMapy) throws IOException {
        File subor = new File(nazovMapy + ".txt");
        Scanner citac = new Scanner(subor);
        
        int sirka = citac.nextInt();
        int vyska = citac.nextInt();
        int pocetLodiek = citac.nextInt();
        
        this.lodky = new Lodka[pocetLodiek];
        
        for (int i = 0; i < pocetLodiek; i++) {
            this.lodky[i] = new Lodka();
        }
        
        this.hraciaPlocha = new Policko[vyska][sirka];
        
        for (int riadok = 0; riadok < vyska; riadok++) {
            for (int stlpec = 0; stlpec < sirka; stlpec++) {
                this.hraciaPlocha[riadok][stlpec] = new Policko(stlpec, riadok, velkostPolicka);
                
                int priradenaLodka = citac.nextInt();
                if (priradenaLodka != 0) {
                    this.hraciaPlocha[riadok][stlpec].priradLodku(this.lodky[priradenaLodka - 1]);
                }
            }
        }
        
        citac.close();
    }
}
