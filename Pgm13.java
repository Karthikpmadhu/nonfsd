package day1.com;

import java.util.Scanner;

public class Pgm13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		String rev =" ";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str= sc.nextLine();
		
		for(int i=0;i<str.length();i++) {
			ch= str.charAt(i);
			rev= ch+rev;
		}
		System.out.println("Reverse: " + rev);
		
	}

}
