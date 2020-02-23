package homework03;

/**In this application we need to create a phone book and add at least 2 contact.
 * Send a message to the first contact and list it.
 * Call the second contact and view the call history.
 * Before send a message and call someone we need to check if we have enought battery to do these actions.
 *
 * @author Loránd
 */

public class MainPhone {
    public static void main(String[] args) {

        //Phone phone= new Device(); // shouldn't compile
        SamsungGalaxyS6 s6 = new SamsungGalaxyS6();
        s6.setColor("black");
        s6.setMaterial("plastic");
        System.out.println("The SamsungGalaxyS6's color is " + s6.getColor() + " and the carcase was made from " + s6.getMaterial() + ".");

        IPhone phone = new SamsungGalaxyS6();

        //add contact to phonebook
        phone.addContact("x","y",74000001);
        phone.addContact("z","w",74000002);
        phone.addContact("v","w",74000003);
        phone.listContact();

        //send message to the first contact and show the message
        phone.sendMessage(74000001,"enter your text here.");
        phone.listMessage(74000001);

        //call the secound contact and check the call history
        phone.call(74000002);
        phone.viewHistory(74000002);

    }
}
