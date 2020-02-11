package Inheritance;

public class Shape {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void draw(){
        System.out.println("Am desenat forma.");
    }

    public void erase(){
        System.out.println("Am sters forma.");
    }

    public void move(){
        System.out.println("Am mutat forma.");
    }

}
