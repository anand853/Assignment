package com.test.one;

import java.util.Scanner;

public class Input {

	Scanner scan = new Scanner(System.in);
	String itemNames[];
	int itemPriority[];
	int count;
	User user = new User();

	public String readUserName() {
		System.out.println("Enter your Name here =>");

		String name = scan.nextLine();
		user.setName(name);
		System.out.println("The name you entered is " + user.getName());
		try {
			isAlpha(name);
		} catch (NameNotString e) {

			e.printStackTrace();
		}

		return name;

	}

	public boolean isAlpha(String name) throws NameNotString {
		char[] chars = user.getName().toCharArray();

		for (char c : chars) {
			if (!Character.isLetter(c)) {
				throw new NameNotString(user.getName() + " contains Number(s) =>");
			}
		}

		return true;
	}

	public String[] NumberOfItemsToBuy() {
		System.out.println("Count of Items to buy =>");
		count = scan.nextInt();
		user.setCount(count);
		itemNames = new String[count];
		scan.nextLine();
		System.out.println("The count you entered is " + count);
		for (int i = 0; i < count; i++) {
			System.out.println(" Please enter the prod name " + count);
			itemNames[i] = scan.nextLine();
			try {
				isAlpha(itemNames[i]);
			} catch (NameNotString e) {

				e.printStackTrace();
			}

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
			user.setItemPriority(itemPriority);
			System.out.println(i + " The prod name is " + user.getItemPriority()[i] + " and the product priorty is "
					+ user.getItemPriority()[i]);
		}
		return itemPriority;

	}

}
