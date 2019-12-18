package calc;

public class Calculator {
    public static void main(String[] args) {
        //args - 1 * 2

        if (args.length < 3) {
            System.out.println("Trebuie sa avem sintaxa, exemplu 1 *2");
        } else {
            int numar1 = Integer.parseInt(args[0]);
            int numar2 = Integer.parseInt(args[2]);
            String op = args[1];
            calculeaza(numar1, numar2, op);
        }
    }

    /**
     * Metoda ce returneaza calculul matematic
     *
     * @param numar1 - o variabila de tip int
     * @param numar2 - o variabila de tip int
     * @param op - operator
     */

    public static void calculeaza(int numar1, int numar2, String op) {
        switch (op.charAt(0)){
            case'-':
                int rez1 = numar1-numar2;
                System.out.println(rez1);
                break;
            case'+':
                int rez2 = numar1+numar2;
                System.out.println(rez2);
                break;
            case'*':
                int rez3 = numar1*numar2;
                System.out.println(rez3);
                break;
            case'/':
                int rez4 = numar1/numar2;
                System.out.println(rez4);
                break;
            default:
                System.out.println("Nu ati introdus parametrii corect!");
        }
    }
}
