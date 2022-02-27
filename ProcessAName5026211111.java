package com.company;
import java.util.Scanner;
public class ProcessAName5026211111 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String n = console.nextLine();
        int index = n.indexOf(" ");
        System.out.println(index);
        String firstName = n.substring(0,1);
        String lastName = n.substring(index+1);
        String name = lastName+", "+firstName+".";
        System.out.println("Your name is: "+name);
    }
}
