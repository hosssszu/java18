package homework04.hashMap;

import java.util.List;

public class Hobby {

    Adresa a = new Adresa("Acasa");

    private String hobby;
    int frequency;
    List<Adresa> list1;

    public Hobby(String hobby) {
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    @Override
    public String toString() {
        return hobby;
    }
}
