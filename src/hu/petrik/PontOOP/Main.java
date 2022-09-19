package hu.petrik.PontOOP;

import hu.petrik.PontOOP.pont.Pont;
import hu.petrik.PontOOP.Kor.Kor;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Pont p1 = new Pont();
        Pont p2 = new Pont(0,0);
        Pont p3 = new Pont(3, 4);
        Pont p4 = new Pont(100);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        Pont [] pontok = new Pont[100];
        for (int i = 0; i < pontok.length; i++) {
            pontok[i] = new Pont(10);
        }

        for(Pont p: pontok)
        {
            System.out.println(p);
        }

        //Origotól legtávolabb eső pont - maximum kiválasztás
        int legTavolabbiPontIndex = 0;
        for (int i = 1; i < pontok.length; i++) {
            if (pontok[legTavolabbiPontIndex].getOrigitolMertTavolsag() < pontok[i].getOrigitolMertTavolsag()){
                legTavolabbiPontIndex = i;
            }
        }
        System.out.printf("A legtávolabbi pont az origotól a(z) %d. pont, kordinátái: %s, origotól mért távolság: %.3f˛\n", (legTavolabbiPontIndex+1),pontok[legTavolabbiPontIndex], pontok[legTavolabbiPontIndex].getOrigitolMertTavolsag());

        System.out.printf("Az egyik pont: %s a másik pont: %s a kettő távolsága: %.3f\n", p3, p4, p3.length(p4));

        System.out.printf("Ez a pont a " + p4.siknegyed() + " síknegyedben van\n");

        Kor k1 = new Kor(3, 4 , 5);
        //minden pont adott
        Kor k2 = new Kor(4);
        //sugar alapu
        Kor k3 = new Kor((Math.random()*100)+1);
        //véletlenszerű

        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
    }




}
