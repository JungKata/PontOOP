package hu.petrik.PontOOP;

import hu.petrik.PontOOP.pont.Pont;

public class Main {
    public static void main(String[] args) {
        Pont p1 = new Pont();
        Pont p2 = new Pont(0,0);
        Pont p3 = new Pont(3, 4);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
