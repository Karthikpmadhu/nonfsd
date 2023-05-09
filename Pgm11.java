package day1.com;

import java.util.Scanner;

public class Pgm11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=7;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a 1st no: ");
		int n1 = sc.nextInt();
		System.out.println("Enter a 2nd no: ");
		int n2 = sc.nextInt();
		
		int i=1;
		while(i<count) {
			System.out.println(n1+ " ");
			int sum=n1 + n2;
			n1 = n2;
			n2 = sum;
			i++;
		}
	}

}
