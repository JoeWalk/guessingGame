package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println("Try to guess the number from 0-100");
        int guess = input.nextInt();
        int count = 0;
        count = count + 1;
        boolean win = false;
        while (win == false) {
            if (guess == number) {
                System.out.println("Correct");
                win = true;
            } else {
                System.out.println("Wrong");
                if (number < guess) {
                    System.out.println("Try guessing lower");
                    System.out.println("Try to guess the number from 0-100");
                    guess = input.nextInt();
                    count = count + 1;
                } else {
                    System.out.println("Try guessing higher");
                    System.out.println("Try to guess the number from 0-100");
                    guess = input.nextInt();
                    count = count + 1;
                }


            }
        }
        System.out.println("It took you " + count + " guesses");
    }
}