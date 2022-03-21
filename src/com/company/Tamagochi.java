package com.company;

public class Tamagochi {


        int x = 6;
        int y = 4;
        int futterstand = 5;

        void fuettern (int f) {
            futterstand = futterstand + f;
        }

        void move(int schritte, String richtung) {

       while (futterstand > 0 && schritte > 0) {
           if (richtung.equals("up")) {
               ++y;
           } else if (richtung.equals("down")) {
               --y;
           } else if (richtung.equals("left")){
               --x;
           } else if (richtung.equals("right")) {
               ++x;
           }
           -- schritte;
           -- futterstand;
       }
    }

    public static void main(String[] args) {
        Tamagochi neon = new Tamagochi();
        neon.x = 6;
        neon.y = 4;
        neon.futterstand = 5;

        neon.move(6, "left");
        neon.fuettern(5);
        neon.move(1, "left");
        neon.move(4,"down");
        System.out.println(neon.x + " " + neon.y);
    }
}