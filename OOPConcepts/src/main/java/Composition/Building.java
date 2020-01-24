package Composition;

public class Building {
    private String nume;
    private Room room;

    public Building(String nume) {
        this.nume = nume;
        this.room = new Room();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

/*    public void setCuloare(String culoare) {
        this.room.setCuloare("saa");
    }

    public void setMarime(int marime) {
        this.room.setMarime(0);
    }
*/
}
