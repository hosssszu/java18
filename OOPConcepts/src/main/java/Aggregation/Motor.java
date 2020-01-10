package Aggregation;

public class Motor {
    private int putere;
    private double capacitate;

    public Motor() {
        this.capacitate = 0.8;
        this.putere = 75;
    }

    public int getPutere() {
        return putere;
    }

    public void setPutere(int putere) {
        if (putere < 75) {
            System.out.println("Nu poate sa fie mai mic de 75.");
        } else {
            this.putere = putere;
        }
    }

    public double getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(double capacitate) {
        if (capacitate < 0.8) {
            System.out.println("Valoarea nu poate fi mai mica de 0.8.");
        } else {
            this.capacitate = capacitate;
        }
    }
}
