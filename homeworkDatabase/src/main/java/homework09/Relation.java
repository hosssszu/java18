package homework09;

public class Relation {
    private int id;
    private int id_accommodation;
    private int id_room_fair;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_accommodation() {
        return id_accommodation;
    }

    public void setId_accommodation(int id_accommodation) {
        this.id_accommodation = id_accommodation;
    }

    public int getId_room_fair() {
        return id_room_fair;
    }

    public void setId_room_fair(int id_room_fair) {
        this.id_room_fair = id_room_fair;
    }

    @Override
    public String toString() {
        return "Accommodation_to_room_fair_relation{" +
                "id=" + id +
                ", id_accommodation=" + id_accommodation +
                ", id_room_fair=" + id_room_fair +
                '}';
    }
}
