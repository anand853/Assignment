package com.test.one;

import java.util.Scanner;

public class Input {

	Scanner scan = new Scanner(System.in);
	String itemNames[];
	int itemPriority[];
	int count;

	public String readUserName() {
		System.out.println("Enter your Name here =>");
		String name = scan.nextLine();
		System.out.println("The name you entered is " + name);
		return name;

	}

	public String[] NumberOfItemsToBuy() {
		System.out.println("Count of Items to buy =>");
		count = scan.nextInt();
		itemNames = new String[count];
		scan.nextLine();
		System.out.println("The count you entered is " + count);
		for (int i = 0; i < count; i++) {
			System.out.println(i + " Please enter the prod name " + count);
			itemNames[i] = scan.nextLine();

		}
		return itemNames;

	}

	public void printNumberOfItemsToBuy(String[] names) {

		for (int i = 0; i < names.length; i++) {
			System.out.println(i + " the prod name is " + itemNames[i]);

		}
	}

	public int[] provideThePriority(String[] names) {
		itemPriority = new int[count];
		for (int i = 0; i < names.length; i++) {
			System.out.println(" Enter the priority for the prod name " + itemNames[i]);
			itemPriority[i] = scan.nextInt();
			System.out.println(i + " The prod name is " + itemNames[i] + "The product priorty is " + itemPriority[i]);
		}
		return itemPriority;

	}

}
