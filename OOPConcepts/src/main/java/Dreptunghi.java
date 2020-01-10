public class Dreptunghi {
    private double lungime;
    private double latime;

    public Dreptunghi(double lungime, double latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    public double getArie() {
        return lungime * latime;
    }

    public double getPerimetru() {
        return 2 * (lungime + latime);
    }

    public double getDiagonala() {
        return Math.sqrt(lungime * lungime + latime * latime); //math.sqrt metoda statica
    }

}
