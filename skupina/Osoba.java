import java.util.ArrayList;

public class Osoba {
    private String meno;
    private String priezvisko;
    private ArrayList<Double> body;

    public Osoba(String meno, String priezvisko) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.body = new ArrayList<Double>();
    }

    public String getMeno() {
        return this.meno;
    }

    public String getPriezvisko() {
        return this.priezvisko;
    }

    public void vypis() {
        System.out.println(this.meno + " " + this.priezvisko);
    }
    
    public void pridajBody(double body) {
        this.body.add(body);
    }
}
