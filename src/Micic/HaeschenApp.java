package Micic;

public class HaeschenApp {

    public static void main(String[] args) {
        //statisches Attribut oder Methode kann auch ohne Objekt oder Instanz verwendet werden.

        //mit dem Namen der Klasse

        System.out.println(Haeschen.spezies);
        Haeschen roger = new Haeschen();

        //auf Attribut zugreifen

        roger.name= "Roger Rabbit";
        roger.color = "White";

        System.out.println(roger.name + " " + roger.color);

        Haeschen BugsBunny = new Haeschen();

        BugsBunny.name = "Bugs Bunny";
        BugsBunny.color = "Black";

        System.out.println("My rabbit is called " + BugsBunny.name + " and he is " + BugsBunny.color);


        // was geht noch, ist aber unüblich


        //  wir testen unsere Hoppelmethode

      //  Haeschen.... geht nicht!

        BugsBunny.hoppel("in the woods.");
        roger.hoppel("to the back.");

        //Aufruf statische Methode

        Haeschen.AusgabeSpezies();


    }
}
