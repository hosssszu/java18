public class Ex1 {
    public static void main(String[] args) {
        int i = 1234;
        inversareNumar(i);

    }

    private static void inversareNumar(int i) {
        int j = 0;
        while (i > 0) {
            j = j * 10 + i % 10;
            i = i / 10;
        }
        System.out.println("numarul inversat este: " + j);
    }
}