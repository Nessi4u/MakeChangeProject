package com.skilldistillery.app;

public class MakeChange {

	public static void main(String[] args) {
		java.util.Scanner askUser = new java.util.Scanner(System.in);

		System.out.print("What is the price of the item? ");
		double itemPrice = askUser.nextDouble();

		System.out.print("How much will you be paying? ");
		double moneyPaid = askUser.nextDouble();
		
		double change =moneyPaid-itemPrice;

		while (moneyPaid < itemPrice) {
			double notEnough = 0.00;
			notEnough = (itemPrice - moneyPaid);
			System.out.print("Sorry but you're short $");
			System.out.printf("%.2f", notEnough);
			System.out.print(" dollar(s), how much will you acutally be paying? ");
			moneyPaid = askUser.nextDouble(); 
			continue;
		}
		while (moneyPaid > itemPrice + 100) {
				System.out.println("Sorry, the most change we can give is $100, do you have anything smaller?");
				moneyPaid = askUser.nextDouble();
			continue;
		}

		if (moneyPaid == itemPrice) {
			System.out.println("Awesome, that's the perfect amount, we hope you come back soon!");

		}
		else {
			double jackson=20, hamilton=10,lincoln=5, washington=1,quarter=.25, dime=.1, nickle=.05, penny=.01;
				
			double resultOne = (change/jackson);
				if (resultOne >= 1) {
				System.out.print((int)resultOne + " twenty dollar bill(s), ");
				}
			double resultTwo =  ((change%jackson)/hamilton);
				if (resultTwo >= 1) {
				System.out.print((int)resultTwo + " ten dollar bill(s), ");
				}
			double resultThree =  ((change%jackson%hamilton)/lincoln);
				if (resultThree >= 1) {
				System.out.print((int)resultThree + " five dollar bill(s), ");
				}
			double resultFour =  ((change%jackson%hamilton%lincoln)/washington);
				if (resultFour >= 1) {
				System.out.print((int)resultFour + " one dollar bill(s), ");
				}
			double resultFive =  ((change%jackson%hamilton%lincoln%washington)/quarter);
				if (resultFive >= 1) {
				System.out.print((int)resultFive + " quarter(s), ");
				}
			double resultSix =  ((change%jackson%hamilton%lincoln%washington%quarter)/dime);
				if (resultSix >= 1) {
				System.out.print((int)resultSix + " dimes(s), ");
				}
			double resultSeven =  ((change%jackson%hamilton%lincoln%washington%quarter%dime)/nickle);
				if (resultSeven >= 1) {
				System.out.print((int)resultSeven + " nickles(s), ");
				}
			double resultEight =  ((change%jackson%hamilton%lincoln%washington%quarter%dime%nickle)/penny);
				if (resultEight >= 1) {
				System.out.print((Math.round(resultEight)) + " penny(s), ");
				}
		
		}

		askUser.close();
	}

}

//site: https://github.com/SkillDistillery/SD35/blob/main/jfop/MakeChange/README.md