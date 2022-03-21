package com.company;

import java.util.Locale;

import Micic.Haeschen;

public class Null {

    public static void main(String[] args) {

        String s = null;
        // wir können damit nichts tun, weil dahinter kein Stringobjekt steht

        // NEVER DO: s.indexOf('a');


        // sobald wir ein Objekt zuweisen ist es kein Problem mehr

        s = "Ich hoffe, dass ich es diesmal verstehen werde";

        System.out.println(s);
        System.out.println(s.toUpperCase(Locale.ROOT));

        Haeschen h; 
    }
}
