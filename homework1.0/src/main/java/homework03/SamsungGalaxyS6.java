package homework03;

import java.util.Arrays;

public class SamsungGalaxyS6 extends Device implements IPhone {

    //instance variables
    private String[] samsung;
    private double imei;

    //constructor
    public SamsungGalaxyS6() {
        //String samsung[] = new String[10];
        this.imei = 512312345645654d;
    }

    //the method to add contacts in the phonebook
    @Override
    public String[] addContact(String firstName, String lastName, int number) {

        String[] samsung = new String[1];
        String s = "First name: " + firstName + ", last name:" + lastName + ", phone number: " + number + ".";
        String[] newArray = Arrays.copyOf(samsung, samsung.length + 0);
        newArray[samsung.length - 1] = s;
        collectNumbers(number);
        collectContacts(s);
        return newArray;
    }

    String[] a = new String[0];
    String[] c = new String[0];
    int[] f = new int[0];
    int h = 0;
    int g = 0;

    public String[] collectContacts(String b) {
        a = Arrays.copyOf(a, a.length + 1);
        a[a.length - 1] = b;
        return a;
    }

    //method to show the contacts
    @Override
    public void listContact() {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public int[] collectNumbers(int g) {
        f = Arrays.copyOf(f, f.length + 1);
        f[f.length - 1] = g;
        return f;
    }

    //method for send message to the first contact
    @Override
    public void sendMessage(int number, String message) {

        for (int i = 0; i < f.length; i++) {
            if (f[i] == number && message.length() < 500) {
                collectMessages(message);
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (f[i] == number && message.length() > 500) {
                System.out.println("Unable to send. The message has more than 500 character.");
            }
        }

        int init = -1;
        for (int i = 0; i < f.length; i++) {
            if (f[i] == number) {
                init = i;
                break;
            }
        }

        if (init >= 0) {
        } else {
            System.out.println("The phone number " + number + " it is not in the phonebook.");
        }
        h++;
    }

    public String[] collectMessages(String d) {
        c = Arrays.copyOf(c, c.length + 1);
        c[c.length - 1] = d;
        return c;
    }

    //method to show the messages
    @Override
    public void listMessage(int number) {
        System.out.println("Sending message to the first contact ...");
        for (int i = 0; i < c.length; i++) {
            if (f[0] == number) {
                System.out.println("The message for the first contact (phone number: " + number + "): " + c[i]);
            }
        }

        int inits = -1;
        for (int i = 0; i < f.length; i++) {
            if (f[0] == number) {
                inits = i;
                break;
            }
        }

        if (inits >= 0) {
        } else {
            System.out.println("The phone number " + number + " it is not the first contact");
        }
        battery();
    }

    //method to call the second contact
    @Override
    public void call(int number) {

        int initss = -1;
        for (int i = 0; i < f.length; i++) {
            if (f[1] == number) {
                initss = i;
                break;
            }
        }

        if (initss >= 0) {
            g++;
            System.out.println("Calling the second contact (phone number: " + number + ").");
        } else {
            System.out.println("The phone number " + number + " it is not the second contact");
        }
    }

    //method to view the call history
    @Override
    public void viewHistory(int number) {

        int initss = -1;
        for (int i = 0; i < f.length; i++) {
            if (f[1] == number) {
                initss = i;
                break;
            }
        }

        if (initss >= 0) {
            g++;
            System.out.println("The second contact was called " + --g + " time.");
        } else {
            System.out.println("The phone number " + number + " it is not the second contact");
        }
        battery();
    }

    //method the battery's life
    public void battery() {
        int l = g * 2 + h;
        int rez = batteryLife - l;

        if (rez > 0) {
            System.out.println("After the actions the remaining of battery is " + rez + " units.");
        } else if (rez == 0) {
            System.out.println("After the actions the remaining of battery is " + rez + " units.\nPlease put to the charger.");
        } else {
            System.out.println("The phone battery is exhausted. Please put to the charger.");
        }
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public void setMaterial(String material) {
        this.material = material;
    }
}