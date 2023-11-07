package Task2;

public class Main {
    public static void main(String[] args) {
        Daughter daughter = new Daughter("Datka", (byte) 22, "Brown eye", "1.60", "Brown hair");
        Daughter daughter1 = new Daughter("Aizat", (byte) 20, "Black eye", "1.60", "Chestnut hair");
        System.out.println(daughter);
        System.out.println(daughter.Name());
        System.out.println(daughter1);
        System.out.println(daughter.Name());
        Mother daughter2 = new Mother("Datka", (byte) 22, "Brown eye");
        Mother daughter3 = new Mother("Aizat", (byte) 20, "Black eye");
        System.out.println();
        System.out.println("Mother"+daughter2);
        System.out.println(daughter2.gettName());
        System.out.println("Mother"+daughter3);
        System.out.println(daughter3.gettName());
    }
}
