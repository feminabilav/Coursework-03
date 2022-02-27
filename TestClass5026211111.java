package com.company;

public class TestClass5026211111 {
    public static void main(String[] args) {
        ComputeMethods5026211111 compute = new ComputeMethods5026211111();
        double celcius = compute.fToC(132);
        System.out.println("Temp in celsius is "+celcius);
        double hypotenuse = compute.hypotenuse(3,4);
        System.out.println("Hypotenuse is "+hypotenuse);
        int dice = compute.roll();
        System.out.println("The sum of the dice values is "+dice);
    }
}
