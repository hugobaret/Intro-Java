package org.example;

import static java.lang.Integer.parseInt;
import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        if (args.length == 2) {
            min = parseInt(args[0]);
            max = parseInt(args[1]);
        }
        int number = new Random().nextInt(max - min + 1) + min;
        int guess = 0;
        int guessCount = 0;
        boolean isRight = false;
        while (!isRight) {
            System.out.println("Your guess.");
            Scanner scanner = new Scanner(System.in);
            guess = scanner.nextInt();
            guessCount++;
            if (guess == number)
                isRight = true;
            else if (guess < number)
                System.out.println("Too low.");
            else
                System.out.println("Too high.");
        }
        System.out.println("It took you " + guessCount + " tries.");
    }
}
