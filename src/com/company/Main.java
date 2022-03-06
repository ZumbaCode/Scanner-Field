package com.company;
import java.util.Scanner;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello What is your Name? ");
        var name = scan.nextLine();
        System.out.println("Hi " + name + " I'm Javabot. Where are you from? ");
        var home = scan.nextLine();
        System.out.println("I hear It's Beautiful at " + home + " I'm From a place called Oracle");
        System.out.println("How old are you? ");
        var age = scan.nextInt();
        System.out.println("So you are " + age  + ", Cool I'm 400 years old");
        System.out.println("This means I'm " + (400 / age) + " Times older tha you");
        System.out.println("Enough about me What is Your Favorite Language? ");
        scan.nextLine();
        var favoriteLanguage = scan.nextLine();
        System.out.println("My Favorite Language is " + favoriteLanguage);

    }
}