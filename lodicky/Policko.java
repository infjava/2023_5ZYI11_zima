import fri.shapesge.Stvorec;

public class Policko {
    private Stvorec stvorec;
    
    public Policko(int x, int y, int velkost) {
        this.stvorec = new Stvorec(x * (velkost + 1), y * (velkost + 1));
        this.stvorec.zmenStranu(velkost);
        this.stvorec.zobraz();
        this.prekresli();
    }
    
    private void prekresli() {
        this.stvorec.zmenFarbu("blue");
    }
}
