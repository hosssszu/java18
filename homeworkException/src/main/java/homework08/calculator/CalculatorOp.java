package homework08.calculator;

public class CalculatorOp {

    // this method is used to select the operation
    public double operation(Double fnum, String operation, Double snum) {

        Add a = new Add();
        Subtract s = new Subtract();
        Multiply mu = new Multiply();
        Divide d = new Divide();
        Modulus mo = new Modulus();

        switch (operation) {
            case "+":
                System.out.println(a.operation(fnum, snum));
                break;
            case "-":
                System.out.println(s.operation(fnum, snum));
                break;
            case "*":
                System.out.println(mu.operation(fnum, snum));
                break;
            case "/":
                System.out.println(d.operation(fnum, snum));
                break;
            case "%":
                System.out.println(mo.operation(fnum, snum));
                break;
            default:
                System.out.println("Illigal Operation");
        }
        return 0;
    }
}