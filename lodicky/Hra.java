import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Hra {
    private Policko[][] hraciaPlocha;
    
    public Hra(int velkostPolicka, String nazovMapy) throws IOException {
        File subor = new File(nazovMapy + ".txt");
        Scanner citac = new Scanner(subor);
        
        int sirka = citac.nextInt();
        int vyska = citac.nextInt();
        
        this.hraciaPlocha = new Policko[vyska][sirka];
        
        for (int riadok = 0; riadok < vyska; riadok++) {
            for (int stlpec = 0; stlpec < sirka; stlpec++) {
                this.hraciaPlocha[riadok][stlpec] = new Policko(stlpec, riadok, velkostPolicka);
            }
        }
        
        citac.close();
    }
}
