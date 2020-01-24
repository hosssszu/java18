package Inheritance;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee e = new Employee();
        e.setNume("X");
        e.setSalar(1000);

        Programmer p = new Programmer();
        p.setNume("Y");
        p.setSalar(2000);
        p.setBonus(100);

        System.out.println(e.getNume() + " " + e.getSalar());
        System.out.println(p.getNume() + " " + p.getSalar() + " "+ p.getBonus());

    }

}
