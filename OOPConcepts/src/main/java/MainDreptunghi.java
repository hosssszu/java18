public class MainDreptunghi {
    public static void main(String[] args) {
        Dreptunghi dreptunghiA = new Dreptunghi(20, 10);
        System.out.println("Aria obiect dreptunghi este " + dreptunghiA.getArie());
        System.out.println("Perimetrul obiect dreptunghi este " + dreptunghiA.getPerimetru());

        Dreptunghi dreptunghiB = new Dreptunghi(40, 40);
        System.out.println("Diagonala obiect dreptunghi este " + dreptunghiB.getDiagonala());
    }
}
