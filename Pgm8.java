package day1.com;

import java.util.Scanner;

public class Pgm8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a no: ");
		int n = sc.nextInt();
		
		for(int i=2;i<n;i++) {
			if(i%2==0) {
			System.out.println(i);
			}
		}
	}

}
