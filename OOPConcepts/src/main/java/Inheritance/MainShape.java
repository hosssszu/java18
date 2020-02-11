package Inheritance;

import java.util.Arrays;

public class MainShape {

    public static void main(String[] args) {

        //int d = 7;

        Shape ca = new Cerc();
        ca.draw();

        Cerc cb = new Cerc();
        cb.draw();


        Cerc c = new Cerc();
        c.setColor("verde");
        System.out.println("Culoare cerc: " + c.getColor());
        c.draw();
        c.erase();
        c.move();

        System.out.println("");

        Triunghi t = new Triunghi();
        t.setColor("mov");
        System.out.println("Culoare cerc: " + t.getColor());
        t.draw();
        t.erase();
        t.move();
        t.fliph();
        t.flipv();

        //polimorfism

        Shape cerc = new Cerc();
        Shape tr = new Triunghi();
//      tr.flipv(); //error
        ((Triunghi) tr).flipv(); //fortezi sa intre si sa ti-l ruleze programul "cast"

        System.out.println("");

        Triunghi t1 = new Triunghi();
        t1.setColor("verde");
        Patrat p1 = new Patrat();
        p1.setColor("alb");
        Cerc c1 = new Cerc();
        c1.setColor("roz");

        Shape[] lista = new Shape[3];

        lista = add(t, lista);
        lista = add(c, lista);

        lista[0] = t1;
        lista[1] = c1;
        lista[2] = p1;

/*        for(int i=0; i<lista.length; i++){
            Shape elemente = lista[i];
            System.out.println(elemente.getColor());
        }
*/
        System.out.println("");

        for (Shape forma : lista) {
            if (forma != null) {
                System.out.println(forma.getColor());
            }

            if (forma instanceof Triunghi) {
                ((Triunghi) forma).flipv();
            }
        }
    }

    public static Shape[] add(Shape shapeToAdd, Shape[] arrayToAddShape) {
        //creez un nou array cu o dimensiune mai mare
        Shape[] newArray = Arrays.copyOf(arrayToAddShape, arrayToAddShape.length + 1);
        //pozitionezi noul element pe ultimul loc
        newArray[arrayToAddShape.length - 1] = shapeToAdd;
        return newArray;
    }
}