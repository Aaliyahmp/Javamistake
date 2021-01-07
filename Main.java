package com.aaliyahphillips;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//System.out.println("Hello Java"); ln gives new line
	//System.out.print("Hi");

	scanner input = new Scanner(System.in);// java cant find symbol
	System.out.println("What is your name?");
	String firstName = input.nextLine();
	System.out.printf("Hello %s!\n", firstName);
	System.out.println("What is your last name?");
	String lastName = input.nextLine();
	System.out.printf("your name is %s %s.\n", firstName, lastName);

        System.out.println("Enter a name");
        String name = input.nextLine();
        System.out.println("Give me an adverb: ");
        String adverb = input.nextLine();
        System.out.println("Give me an adjective: ");
        String adjective = input.nextLine();
        System.out.println("Give me a verb: ");
        String verb = input.nextLine();
        System.out.println("Give me your name");
        String Yourname = input.nextLine(); //

//byte b = byte(1234); //class expected
    }
}
