package loopexamples;

public class Main {
    public static void main(String[] args) {
        int arrayInt[] = {10, 20, 30, 40, 50};
        afisare(arrayInt);
        calc(arrayInt);
    }

    public static void afisare(int[] arrayInt) {
        //afisare array
        for (int elem : arrayInt) {
            System.out.println(elem);
        }
    }

    public static void calc(int[] arrayInt) {
        //calcul suma in functie de conditii
        int suma = 0;
        for (int elem : arrayInt) {
            if (elem == 30) {
                continue;
            }
            if (suma > 100) {
                break;
            }
            suma = suma + elem;
            System.out.println("element: " + elem + "\tsuma: " + suma);
        }
        System.out.println("am iesit din bucla for si suma este: " + suma);
    }
}