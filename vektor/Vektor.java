public class Vektor {
    private double[] vektor;
    
    public Vektor(double[] vektor) {
        this.vektor = vektor;
    }
    
    public double skalarnySucin(Vektor vektorB) {
        // doplnit kod
        return 0;
    }
    
    public double getPrvok(int index) {
        return this.vektor[index];
    }
    
    public int getDlzka() {
        return this.vektor.length;
    }
    
    public void vypisVektor() {
        System.out.print("(");
        int index = 0;
        for (double zlozka : this.vektor) {
            if (this.vektor.length - 1 == index) {
                System.out.format("%.2f", zlozka);
            } else {
                System.out.format("%.2f; ", zlozka);
            }
            index++;
        }
        System.out.println(")");
    }
}
