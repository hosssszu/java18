public class MainLight {
    public static void main(String[] args) {
        Light bec1 = new Light(5);
        bec1.on();
        bec1.off();
        bec1.dimen();
        bec1.brighten();

        Light bec2 = new Light(20);
        bec2.brighten();
        bec2.brighten();
        bec2.dimen();
    }
}
