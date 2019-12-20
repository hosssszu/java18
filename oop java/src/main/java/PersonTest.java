public class PersonTest {
    public static void main(String[] args) {
        Person obiect1 = new Person();
        System.out.println(obiect1.name);
        obiect1.name = "Ana";
        System.out.println("Noul nume: " + obiect1.name);
        Person obiect2 = new Person("Bogdan");
        System.out.println(obiect2.name);
    }
}
