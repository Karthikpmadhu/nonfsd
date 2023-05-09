package day1.com;

import java.util.Scanner;

public class Pgm9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a no: ");
		int n = sc.nextInt();
		
		int i,fact=1;
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial: " + fact);
	}

}
