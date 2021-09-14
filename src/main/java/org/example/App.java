package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Creates reader

        System.out.printf("What is your age? ");
        String age = reader.nextLine();
        int age1 = Integer.parseInt(age);

        if(age1 <= 15) {
            System.out.printf("You are not old enough to legally drive.");
        }
        else {
            System.out.printf("You are old enough to legally drive.");
        }
    }
}