package homework03;

public abstract class Device {

    final int batteryLife = 15;
    String model;
    String manufacters;

    String color;
    String material;
    String imei;

    public abstract String getColor();
    public abstract void setColor(String color);
    public abstract String getMaterial();
    public abstract void setMaterial(String material);

}
