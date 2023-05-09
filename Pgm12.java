package day1.com;

import java.util.Scanner;

public class Pgm12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a no: ");
		int n = sc.nextInt();
		
		do {
			sum+=i;
			i++;
		}
		while(i<=n); 
		System.out.println(sum);
	}

}
