package homework04.treeSet;

public class Persoana {
    private String nume;
    private int varsta;

    public Persoana(String nume, int varsta){
        this.nume = nume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String toString(){
        return "Nume: "+this.nume+" -- varsta: "+this.varsta;
    }
}
