package Task3;

public class Main {
    public static void main(String[] args) {
        Luchnik luchnik = new Luchnik("Blad", 1, "Длинный Лук", 15);
        Luchnik luchnik1 = new Luchnik("Mount", 2, "Плоский лук", 20);
        System.out.println(luchnik);
        System.out.println(luchnik1);
        System.out.println();

        Ryzar ryzar = new Ryzar("Artur", 3, 100, "20");
        Ryzar ryzar1 = new Ryzar("Sherf", 4, 50, "19");
        System.out.println(ryzar);
        System.out.println(ryzar1);
        System.out.println();

        Vsadnik vsadnik = new Vsadnik("Adam", 5, "White", 80);
        Vsadnik vsadnik1 = new Vsadnik("Manas", 6, "Black", 70);
        System.out.println(vsadnik);
        System.out.println(vsadnik1);
        System.out.println();

        Filosof filosof = new Filosof("Blad", 7, "Длинный Лук", "25");
        Filosof filosof1 = new Filosof("Mount", 8, "Плоский лук", "34");
        System.out.println(filosof);
        System.out.println(filosof1);
        Spartans spartans = new Spartans();
        Spartans[] name = {ryzar, luchnik, filosof, vsadnik, ryzar1, luchnik1, filosof1, vsadnik1};
        for (int i = 1; i < name.length+1; i++) {
            for (int j = 0; j < name.length; j++) {
                if(i == name[j].getCount()) System.out.println(name[j].getName());
            }
        }
    }
}