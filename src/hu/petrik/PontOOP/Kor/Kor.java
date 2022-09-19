package hu.petrik.PontOOP.Kor;


public class Kor {
    private double s;
    private int x;
    private int y;


    public Kor(double s) {
    this.s = s;
    x = 0;
    y = 0;
    }

    public Kor(double s, int x, int y)
    {
        this.s = s;
        this.x = x;
        this.y = y;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double kerulet(){
        var kerulet = 2 * s * Math.PI;
        return kerulet;
        // 2 * sugár --> atmérő * pi
    }

    public double terulet()
    {
        var terulet = Math.pow(s, 2) * Math.PI;
        return terulet;
    }

    @Override
    public String toString() {
        return String.format("(%f, %d, %d)" ,this.s, this.x, this.y);
    }

}