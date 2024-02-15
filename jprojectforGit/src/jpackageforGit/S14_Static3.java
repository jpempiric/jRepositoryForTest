package jpackageforGit;

public class S14_Static3 {

	int roll; // Declaration Global Non-Static Variable 
	String name; //Declaration Global Non-Static Variable 
	static String college="IIT Bombay";
	
	//Constructor
	S14_Static3(int r,String n){
		roll=r;
		name=n;
	}
	
	//User Define Method
	
	public void getResult()
	{
		System.out.println(roll+" "+name+" "+college);
	}
		

	}


