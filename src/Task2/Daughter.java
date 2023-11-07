package Task2;

public class Daughter extends Mother {
    private String hairColor;
    private String heigh;

    public Daughter(String name, byte age, String eyeColor, String heigh, String hairColor) {
        super(name, age, eyeColor);
        this.hairColor = hairColor;
        this.heigh = heigh;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getHeigh() {
        return heigh;
    }

    public void setHeigh(String heigh) {
        this.heigh = heigh;
    }
    public String Name(){ return getName() + " This is Daughter";}

    @Override
    public String toString() {
        return "Daughter{"+ super.toString() +
                "hairColor='" + " " + hairColor + '\'' +
                ", heigh='" + heigh + '\'' +
                '}';
    }
}
