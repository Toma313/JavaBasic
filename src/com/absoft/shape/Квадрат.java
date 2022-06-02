package com.absoft.shape;

public class Квадрат extends Rectangle{

    private double side1;

    public Квадрат(double side){

        super (side, side);
        side1 = 1000.1;
        super.side1 = 100;
    }
    public double getSquareSide (){
        return side1;
    }
}
