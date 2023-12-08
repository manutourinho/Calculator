package app;

import model.Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printWelcome();
        Calculator input = new Calculator(scanner.nextLine());

        input.calculation();


    }

    public static void printWelcome() {
        System.out.println("hello! let's do some math? but it needs to be simple, only numbers less than 10 are allowed!");
        System.out.print( "please, enter your calculation: ");
    }

}


