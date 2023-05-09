package day1.com;

import java.util.Scanner;

public class Pgm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no:");
		int n = sc.nextInt();
		
		if(n%2==0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number");
		}

	}

}
