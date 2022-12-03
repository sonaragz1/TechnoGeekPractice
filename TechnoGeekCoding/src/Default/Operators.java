package Default;

public class Operators {
	
	public static void main(String[] args) {
		assignmentoperator();  // calling function here in main method
		arithmaticoperator();
		comparisonoperator();
		logicaloperator();
		ternaryoperator();
	}

	public static void assignmentoperator() {    //only one assignment operator " = "
		int a=10;
		char ch ='A';
		System.out.println(a);
		System.out.println(ch);
		System.out.println("-----------------");
		 
		}
	public static void arithmaticoperator() {
		// +, -, *, /, %
		int a=10;
		int b=3;

		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println("-----------------");
	}
	public static void comparisonoperator() {
		// <, >, ==, !=, >=,<=
		int a=10;
		int b=3;
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println("-----------------");
		
	}
	public static void logicaloperator() {
		int a=10;
		int b=3;
		
		System.out.println((a>b) && (a<b));// false
		System.out.println((a>b) && (a>=b));//true
		
		System.out.println((a>b) || (a<b));//true
		System.out.println("-----------------");
	}
	public static void ternaryoperator() {
		// (condition)? expression1:expression2 if true then first, if false then second
		int a=10;
		int b=3;
		int result=(a>b) ? (a+b):(a*b);
		System.out.println(result);
		System.out.println("-----------------");
		
		}
	public static void findmaxofthree() {
		int a=24, b=35, c=25;
		int max=(a>b)?((a>c)? a:c):((b>c)?b:c);
		System.out.println(max);
		
	}
	}

