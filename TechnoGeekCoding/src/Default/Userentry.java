package Default;

import java.util.Scanner;
public class Userentry {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
	System.out.println( " Enter first Number =");	
	int num = in.nextInt();
	
	System.out.println( " Enter second Number =");	
	int num1 = in.nextInt();
	
	System.out.println( " Enter third Number =");	
	int num2 = in.nextInt();
	
	int grt = 0;
	if (num>num1) {
		grt = num;
		
	}
	else {
		grt=num1;
	}
	
	if (grt>num2) {
		System.out.println("Greater no is  "+grt);
	}
	else {
		System.out.println("Greater no is  "+num2);
	}
	
	//int num2= num+num1;
	
	/*
	 * System.out.println( " Result of addition is =");
	 * System.out.println(num+num1);
	 */
	//int num3= in.nextInt();
	
	
		
		// TODO Auto-generated method stub

	}

}
