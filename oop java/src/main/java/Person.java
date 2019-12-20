public class Person {
    String name; //variabila de instanta sau atribute
    int age;



    public Person() {
        System.out.println("Constructorul implicit a fost apelat");
        this.name = "no name";
    }

    public Person(String name) {
        System.out.println("Constructorul explecit cu 1 parametru a fost activat");
        this.name = name;
    }
}