package day1.com;

import java.util.Scanner;

public class Pgm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 1st no:");
		int a = sc.nextInt();
		System.out.println("Enter 2nd no:");
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println("1st integer is greater");
		}
		else  if(b>a) {
			System.out.println("2nd integer is greater");
		}
		else {
			System.out.println("Equal");
		}

	}

}
