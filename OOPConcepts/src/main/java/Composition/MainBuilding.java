package Composition;

public class MainBuilding {
    public static void main(String[] args) {
        Building c = new Building("CBC");

//        c.setMarimeCamera(100);
//        c.setCuloareCamera("rosu");
//        System.out.println(c.getNume() + " " + c.getRoom().getCuloare() + " " + c.getRoom().getMarime());

        c.getRoom().setCuloare("verde");
        c.getRoom().setMarime(100);
        System.out.println("Denumirea cladirii este: " + c.getNume() + ", culoarea camerei este "
        + c.getRoom().getCuloare() + ", si are marimea " + c.getRoom().getMarime() + ".");

    }
}
