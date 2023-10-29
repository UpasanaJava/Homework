package homework;

import java.util.Scanner;

public class Main {
	
	static void evenrange(int x) {
		int i;
		for (i=1; i<x; i++) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	static void ismax(int x, int y) {
		if (x > y) {
			System.out.println(x);
		}
		if (x<y) {
			System.out.println(y);
		}
		else {
			System.out.println("They are equal");
		}
	}
	
	static void gradereview(String x, String y) {
		switch(y) {
		case "A":
		case "a":
			System.out.println("Excellent");
			break;
		case "B":
		case "b":
			System.out.println("Good");
			break;
		case "C":
		case "c":
			System.out.println("Try harder");
		default:
			System.out.println("Failed");
			break;
		}

	}
	
	static void reversesec(String x, String y) {
		int i;
		for (i=y.length()-1 ;i>=0; i-- ) {
			System.out.print(y.charAt(i));
		}
		System.out.print(" " + x);
		
	}
	static void mixedcase(String x) {
		int i;
		for (i=0; i<x.length(); i++) {
			char ch = x.charAt(i);
			if (Character.isUpperCase(ch)) {
				System.out.print(Character.toLowerCase(ch));
			}
			else {
				System.out.print(Character.toUpperCase(ch));
			}
		}
	}
	static void concat(String x) {
	    for (int i = 0; i < x.length(); i++) {
	        char ch = x.charAt(i);
	        if (Character.isAlphabetic(ch)) {
	            System.out.print(ch);
	        } else if (ch == '.' || ch == ',' || ch == ';') {
	            System.out.println();
	        }
	    }
	}
	public static void main(String[] args) {
		
		//QUESTION 1
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Give a number to find out the even Range");
//		int number = scanner.nextInt();
//		evenrange(number);
//		scanner.close();
		
		
		// QUESTION 2 
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("First Number to compare : ");
//		int firstno = scanner.nextInt();
//		System.out.println("First Number to compare : ");
//		int secondno = scanner.nextInt();
//		ismax(firstno,secondno);
		
		//QUESTION 3
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Write the subject Name");
//		String subj = scanner.next();
//		System.out.println("Write the grades in capital");
//		String grade = scanner.next();
//		gradereview(subj,grade);
		//QUESTION 4;
		
		//QUESTION 5
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("First String :");
//		String str1 = scanner.next();
//		System.out.println("Second String : ");
//		String str2 = scanner.next();
//		reversesec(str1, str2);
	
		//QUESTION 6
//	 	Scanner scanner = new Scanner(System.in);
//		System.out.println("String :");
//		String str = scanner.next();
//		mixedcase(str);
		
		//QUESTION 7
//	 	Scanner scanner = new Scanner(System.in);
//		System.out.println("String :");
//		String str = scanner.nextLine();
//		concat(str);
//		
	}
}
