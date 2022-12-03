package Default;

import java.util.Scanner;

//import java.util.Scanner

/* if(condition){
 * code 
 */
 
public class LoopProj {

	public static void main(String[] args) {
		voting();
	}
	
		// TODO Auto-generated method stub
		public static void voting(){
			System.out.println( " Program Starts");
			Scanner in = new Scanner (System.in);
			System.out.println( " Enter age");
			int age = in.nextInt();
			if(age>18)
			{
				System.out.println( "eligible for voting");
			}
			else {
				System.out.println( " Not eligible for voting");
			}
			System.out.println( " Program ends");
		}
	}


