package Task1;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Iphone 15 pro", "Apple", "17", "16x20");
        Phone phone2 = new Phone("Iphone 15 pro Max", "Apple", "20", "20x25");

        System.out.println(phone1);
        System.out.println(phone1.getName() + " " + phone1.turnOn());
        System.out.println(phone1.getName() + " " + phone1.turnOff());

        System.out.println(phone2);
        System.out.println(phone2.getName() + " " + phone2.turnOn());
        System.out.println(phone2.getName() + " " + phone2.turnOff());

    }
}