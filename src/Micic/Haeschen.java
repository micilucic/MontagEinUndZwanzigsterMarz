package Micic;

public class Haeschen {

    //Für Farben kann man String oder

    String color;
    String name;

    //Klassenattribut

    static String spezies = "Leporidae";


    public void hoppel (String whereTo) {
        System.out.println(name + " " + "hoppelt " + whereTo);
    }

    //In statischen Methoden können wir nur auf statische Attribute zugreifen, weil der Computer die anderen nicht erkennt


    public static void AusgabeSpezies () {
        System.out.println(spezies);
    }
}
