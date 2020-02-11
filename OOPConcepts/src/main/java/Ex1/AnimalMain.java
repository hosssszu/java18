package Ex1;

public class AnimalMain {
    public static void main(String[] args) {
        Pisica p1 = new Pisica();
        p1.setNume("p1");
        Pisica p2 = new Pisica();
        p2.setNume("p2");

        Caine c1 = new Caine();
        c1.setNume("c1");

        //afisare nume, 2 pisici si o caine

        Animal[] adapost = new Animal[3];
        adapost[0] = p1;
        adapost[1] = p2;
        adapost[2] = c1;

        for (Animal animal : adapost) {
            System.out.println(animal.getNume());
        }
    }
}
