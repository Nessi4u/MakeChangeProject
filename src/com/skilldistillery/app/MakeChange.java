package com.skilldistillery.app;

public class MakeChange {

	public static void main(String[] args) {
		java.util.Scanner askUser = new java.util.Scanner(System.in);

		System.out.print("What is the price of the item? ");
		double itemPrice = askUser.nextDouble();

		System.out.print("How much will you be paying? ");
		double moneyPaid = askUser.nextDouble();

		while (moneyPaid < itemPrice) {
			double notEnough = 0.00;
			notEnough = (itemPrice - moneyPaid);
			System.out.print("Sorry but you're short $");
			System.out.printf("%.2f", notEnough);
			System.out.print(" dollar(s), how much will you acutally be paying? ");
			moneyPaid = askUser.nextDouble(); // does not loop if I do less again
			continue;
		}
		while (moneyPaid > itemPrice) {
			if (moneyPaid > itemPrice + 100) {
				System.out.println("Sorry, the largest bills we take are $100s, do you have anything else?");
				moneyPaid = askUser.nextDouble();
			}
			continue;
		}

		if (moneyPaid == itemPrice) {
			System.out.println("Awesome, that's the perfect amount, we hope you come back soon!");

		}

		askUser.close();
	}
	// public static void menu() {

	// }

}

//site: https://github.com/SkillDistillery/SD35/blob/main/jfop/MakeChange/README.md