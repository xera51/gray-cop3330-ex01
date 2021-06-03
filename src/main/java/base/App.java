/*
 *  UCF COP3330 Summer 2021 Exercise 1 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String name = myApp.readName();
        String output = myApp.generateOutputString(name);
        myApp.displayOutput(output);
    }

    public String readName() {
        System.out.print("What is your name? ");
        return in.nextLine();
    }

    public String generateOutputString(String name) {
        return "Hello, " + name + ", nice to meet you!";
    }

    public void displayOutput(String output) {
        System.out.println(output);
    }

}
