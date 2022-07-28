package com.example;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Please enter two numbers");

		Scanner scanner = new Scanner(System.in);
		int numberOne = scanner.nextInt();
		int numberTwo = scanner.nextInt();
		//System.out.println("You entered "+ numberOne +" and "+ numberTwo);
		System.out.println("Please enter operation like addition, subtraction, division, multiplication.");

		Scanner scanner2 = new Scanner(System.in);

		String operation = scanner2.nextLine();
		//System.out.println("You entered "+ operation) ;

		switch (operation) {

		
		case "addition"://This is equal to if (day==1)
			int sum = numberOne + numberTwo;
			System.out.println("Answerr is = " + sum);
			break;

		case "substraction":
			int substraction = numberOne - numberTwo;	
			System.out.println("Answerr is = " + substraction);
			break;

		case "division":
			System.out.println("Answerr is = " + numberOne/numberTwo);
			break;

		case "multiplication":
			System.out.println("Answerr is = " + numberOne*numberTwo);
			break;

		default:
			System.out.println("Not a valid operation");
		}






		/*
		 * ; case 2: System.out.println("Tuesday");
		 * 
		 * break; case 3: System.out.println("Wedesday"); break; case 4:
		 * System.out.println("Thursday"); break; case 5: System.out.println("Friday");
		 * break; case 6: System.out.println("Saswitch (day) { case 1://This is equal to
		 * if (day==1) System.out.println("Sunday"); breakturday"); break; case 7:
		 * System.out.println("Monday"); break; default:
		 * System.out.println("Not Valid Day"); }
		 */


	}

}
