package day1.com;

import java.util.Scanner;

public class Pgm10 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a no:");
		int n = sc.nextInt();
		int count=0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
		if(count==2)
		{
			System.out.println("Is prime no");
		}
		else
		{
			System.out.println("Is not prime no");
		}
		
	}

}
