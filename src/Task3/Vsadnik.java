package Task3;

public class Vsadnik extends Spartans {
        private String colorHours;
        private int speedHours;

    public Vsadnik(String name, int count, String colorHours, int speedHours) {
        super(name, count);
        this.colorHours = colorHours;
        this.speedHours = speedHours;
    }

    public String getColorHours() {
        return colorHours;
    }

    public void setColorHours(String colorHours) {
        this.colorHours = colorHours;
    }

    public int getSpeedHours() {
        return speedHours;
    }

    public void setSpeedHours(int speedHours) {
        this.speedHours = speedHours;
    }

    @Override
    public String toString() {
        return "Vsadnik{" +
                "colorHours='" + colorHours + '\'' +
                ", speedHours=" + speedHours +
                "} " + super.toString();
    }
}
