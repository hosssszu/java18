package homework02;

/**
 * In this class we set the instance variable paperQuality.
 */

public class Art extends Book {
    private String paperQuality;

    public String getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(String quality) {
        this.paperQuality = quality;
    }

    public void qualitys() {
        System.out.println("Calitatea hartiei este " + getPaperQuality() + ".");
    }
}
