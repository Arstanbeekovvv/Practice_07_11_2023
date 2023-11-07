package Task1;

public class Computer extends Technique {
    public Computer(String name, String brand, String version, int yearComputer) {
        super(name, brand, version);
        this.yearComputer = yearComputer;
    }

    private int yearComputer;

    public int getYearComputer() {
        return yearComputer;
    }

    public void setYearComputer(int yearComputer) {
        this.yearComputer = yearComputer;
    }
    public String turnOn(){ return " TurnOn";}
    public String turnOff(){ return " TurnOff";}

    @Override
    public String toString() {
        return "Computer{" +
                "yearComputer=" + yearComputer + super.toString() +
                '}';
    }
}
