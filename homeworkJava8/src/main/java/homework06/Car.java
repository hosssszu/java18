package homework06;

public class Car {
    private String model;
    private int age;
    private String color;

    public Car(String model, int age, String color){
        this.model = model;
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "{" +
                "model='" + model + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
