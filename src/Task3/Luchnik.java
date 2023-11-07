package Task3;

public class Luchnik extends Spartans {
    private String formorujiya;
    private int kolichestvoluka;

    public Luchnik(String name, int count, String formorujiya, int kolichestvoluka) {
        super(name, count);
        this.formorujiya = formorujiya;
        this.kolichestvoluka = kolichestvoluka;
    }

    public String getFormorujiya() {
        return formorujiya;
    }

    public void setFormorujiya(String formorujiya) {
        this.formorujiya = formorujiya;
    }

    public int getKolichestvoluka() {
        return kolichestvoluka;
    }

    public void setKolichestvoluka(int kolichestvoluka) {
        this.kolichestvoluka = kolichestvoluka;
    }

    @Override
    public String toString() {
        return "Luchnik{" +
                "formorujiya='" + formorujiya + '\'' +
                ", kolichestvoluka=" + kolichestvoluka +
                "} " + super.toString();
    }
}
