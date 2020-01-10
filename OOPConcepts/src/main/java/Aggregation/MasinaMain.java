package Aggregation;

public class MasinaMain {
    public static void main(String[] args) {
        //masina vw de culoare alba cu motor capacitate 1 si putere 75
        Motor motorvw = new Motor();
        motorvw.setCapacitate(1);
        motorvw.setPutere(75);

        System.out.println("Capacitate: " + motorvw.getCapacitate());
        System.out.println("Putere: " + motorvw.getPutere());
        System.out.println("");

        Masina masinavw = new Masina(motorvw, "wv");
        masinavw.setCuloare("alb");
        System.out.println("Masina " + masinavw.getNume() + " are culoarea " + masinavw.getCuloare() + " si motor de putere "
        + masinavw.getMotor().getPutere() + " si capacitatea " + masinavw.getMotor().getCapacitate());

        masinavw = null;
        // chiar daca obiectul masinavw a fost distrusa inca mai exista.
        //raspunde la intrebarea "has a"

    }
}