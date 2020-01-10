public class Light {
    // attributes
    public static final int MAX = 100;
    public static final int MIN = 0;
    private int step;
    private int intensitateaCurenta;

    //constructor
    public Light(int step) {
        this.step = step;
        this.intensitateaCurenta = 0;// step din constructor ii egal cu "private int step"
    }

    public void on() {
        System.out.println("Intensitatea este: " + MAX);
        this.intensitateaCurenta = MAX;
    }

    public void off() {
        System.out.println("Becul este stins");
        this.intensitateaCurenta = MIN;
    }

    public void brighten() {
        if (intensitateaCurenta + step < MAX) {
            intensitateaCurenta = intensitateaCurenta + step;
            System.out.println("Intensitatea curentului este: " + intensitateaCurenta);
        } else {
            System.out.println("Nu se mai poate creste intensitatea");
        }
    }

    public void dimen() {
        if (intensitateaCurenta - step > MIN) {
            intensitateaCurenta = intensitateaCurenta - step;
            System.out.println("Intensitatea curentului este: " + intensitateaCurenta);
        } else {
            System.out.println("Becul este stins");
        }
    }
}
