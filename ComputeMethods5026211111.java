package com.company;

import java.lang.Math;

public class ComputeMethods5026211111 {

    public double fToC(double degreesF) {
        double c = (degreesF-32)*5/9;
        return c;
    }
    public double hypotenuse(int a, int b){
        double h = Math.sqrt((a*a)+(b*b));
        return h;
    }
    public int roll(){
        int num1 = (int)(6*Math.random())+1;
        int num2 = (int)(6*Math.random())+1;
        int dice = num1+num2;
        return dice;
    }
}
