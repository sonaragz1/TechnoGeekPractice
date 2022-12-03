package Default;

public class Rememberalways {
	//int b;   //instance variable belongs to the objects (Car example )
	static String courseName ;   //class variable as starts with static word
    String StName;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   //detatype  refname = value;
		//int a = 20;  //Local variable as it is defined in main method
		//String name = "Sonal";
		//int num;   //declaration of variable
		//num=10;    // initialization of variable
		
		Rememberalways obj1= new Rememberalways();
		Rememberalways obj2= new Rememberalways();
		obj1.StName="Sonal";
		courseName="Java";
		obj2.StName="Raghav";
		//obj1.StName="Varnika";
		//courseName="Selenium";
		System.out.println(obj1.StName);
		System.out.println(courseName);
		System.out.println(obj2.StName);
		System.out.println(courseName);
		
		
	}

}

