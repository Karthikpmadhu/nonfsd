package day1.com;

public class Pgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //converting Integer to String
		
		int a =45;
		String b = Integer.toString(a);
		System.out.println(a);
		
		//converting String to integer
		
		String s="200";
		int q =Integer.parseInt(s);
		System.out.println(s);
		
		//converting double to integer
		
		double d =23.9;
		int y=(int)d;
		System.out.println(y);
		
		//converting string to double
		
		String x ="24.8";
		double z =Double.parseDouble(x);
		System.out.println(z);
	}

}
