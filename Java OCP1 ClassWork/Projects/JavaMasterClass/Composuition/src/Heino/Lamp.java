package Heino;

public class Lamp {
    private String style;
    private boolean Battery;
    private int globRating;


    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        Battery = battery;
        this.globRating = globRating;
    }


    public void turnOn() {
        System.out.println("Lamp -> Turn on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return Battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
