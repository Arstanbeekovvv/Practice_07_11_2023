package Task3;

public class Ryzar extends Spartans {
    private int kolichestvoBoi;
    private String liveVek;

    public Ryzar(String name, int count, int kolichestvoBoi, String liveVek) {
        super(name, count);
        this.kolichestvoBoi = kolichestvoBoi;
        this.liveVek = liveVek;
    }

    public int getKolichestvoBoi() {
        return kolichestvoBoi;
    }

    public void setKolichestvoBoi(int kolichestvoBoi) {
        this.kolichestvoBoi = kolichestvoBoi;
    }

    public String getLiveVek() {
        return liveVek;
    }

    public void setLiveVek(String liveVek) {
        this.liveVek = liveVek;
    }

    @Override
    public String toString() {
        return "Ryzar{" +
                "kolichestvoBoi=" + kolichestvoBoi +
                ", liveVek='" + liveVek + '\'' +
                "} " + super.toString();
    }
}
