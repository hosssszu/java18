package homework02;

/**
 * In this class we set the instance variable type.
 */

public class Novel extends Book {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void types() {
        System.out.println("Tipul novelei este " + getType() + ".");
    }
}
