package Task1;

public class Phone extends Technique {
    private String screen;
    public Phone(String name, String brand, String version, String model) {
        super(name, brand, version);
        this.screen = model;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }
    public String turnOn(){ return " TurnOn";}
    public String turnOff(){ return " TurnOff";}

    @Override
    public String toString() {
        return "Phone: " + super.toString() +
                "screen = " + screen;
    }
}
