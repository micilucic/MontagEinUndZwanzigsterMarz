package com.company;

public class Konstante {
    public static void main(String[] args) {

        //das sind beides Konstanten, denen man maximal einmal einen Wert zuweisen

        final int geburtsjahr = 1970;
        final int todesjahr;

        System.out.println(geburtsjahr);
      // noch nicht initialisiert, deshalb geht es nicht
        // System.out.println(todesjahr);

        todesjahr = 2222;

        System.out.println(todesjahr);

    }
}
