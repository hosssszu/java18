package Composition;

public class Room {
    private String culoare;
    private int marime;

    public Room() {
        this.culoare = "alba";
        this.marime = 10;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getMarime() {
        return marime;
    }

    public void setMarime(int marime) {
        this.marime = marime;
    }

/*    public void setMarimeCamera(int i) {
        this.setMarime(0);
    }

    public void setCuloareCamera(String rosu) {
        this.setCuloare("s");
    }
*/
}
