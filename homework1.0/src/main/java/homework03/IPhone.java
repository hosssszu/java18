package homework03;

public interface IPhone {
    String[] addContact(String firstName, String lastName, int number);
    void listContact();
    void sendMessage(int number, String message);
    void listMessage(int number);
    void call(int number);
    void viewHistory(int number);

}
