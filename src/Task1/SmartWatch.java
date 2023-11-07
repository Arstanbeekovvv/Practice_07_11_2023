package Task1;

public class SmartWatch extends Technique {
    private String color;

    public SmartWatch(String name, String brand, String version, String color) {
        super(name, brand, version);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String turnOn(){ return " TurnOn";}
    public String turnOff(){ return " TurnOff";}

    @Override
    public String toString() {
        return "SmartWatch{" +
                "color='" + color + '\'' + super.toString() +
                '}';
    }
}
