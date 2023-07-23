package com.javacourse;
import  java.util.Random;
import java.util.Scanner;

public class gamecode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for paper, 2 for sessior:");
        int userinput = sc.nextInt();

        Random random = new Random();
        int computerinput = random.nextInt(3);

        if (userinput == computerinput) {
            System.out.println("Draw");
        } else if (userinput == 0 && computerinput == 2 || userinput == 1 && computerinput == 0 || userinput == 2 && computerinput == 1) {

            System.out.println("you win");
        } else {
            System.out.println("compuetr win");
        }
        System.out.println("compuetr choice: " + computerinput);

    }
}
