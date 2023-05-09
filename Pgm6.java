package day1.com;

import java.util.Scanner;

public class Pgm6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st no: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd no: ");
	    int b = sc.nextInt();
	    System.out.println("Enter 3rd no: ");
		int c = sc.nextInt();
		
		if ((a>b) && (a>c)){
			System.out.println("1st no is great");
		}
		else if(b>c){
			System.out.println("2nd no is great");
		}
		else {
			System.out.println("3rd no is great");
		}
				
	}

}
