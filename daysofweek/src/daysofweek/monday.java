package daysofweek;

import java.util.Scanner;

public class monday {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int day=sc.nextInt();
		
		switch (day) {
		case 1://This is equal to if (day==1)
		System.out.println("Sunday");
		break;
		case 2:
		System.out.println("Tuesday");
		
		break;
		case 3:
		System.out.println("Wedesday");
		break;
		case 4:
		System.out.println("Thursday");
		break;
		case 5:
		System.out.println("Friday");
		break;
		case 6:
		System.out.println("Saturday");
		break;
		case 7:
			System.out.println("Monday");
			break;
		default:
		System.out.println("Not Valid Day");
		}
	}
		
		

	}


