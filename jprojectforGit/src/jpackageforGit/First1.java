package jpackageforGit;

public class First1 {

	int a=9;     //Global Non-Static Variable
	static int b=10;   //Global Static Variable
	
	//User Define Static Method 
	public static void cMethod() {
		System.out.println(" this is Static Method C");
	}
	
	//User Define Non-Static Method 
	public void dMethod() {
		System.out.println("hi..This is Non-Static Method");
	}
	
	public static void main(String[] args) {
		
		First1 f1=new First1();
		System.out.println(f1.a);
		
		System.out.println(b);
		
		//print for Static Method
		cMethod();
		//print for Non-Static Method
		f1.dMethod();
		
		System.out.println("Hello, this is Print Sprint Parameter");
		System.out.println(1234);   //Print Integer Parameter 
		
		b=20;
		System.out.println(b);
		int x=5;   //Local Variable
		System.out.println(x);
		

	}

}
