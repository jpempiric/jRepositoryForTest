package jpackageforGit;

public class S14_Static5 {

	static int z=5;  //static Global Variable
	int y=1; // Non-Static Global Variable
	
	//Static Method
	public static void a()	
	{
		z=10;
		System.out.println(z);  //10	
	}
	
	//Non-Static Method 
	public void b()
	{
		z=15;
		System.out.println(z);
		a();
	}
		
	public static void main(String[] args) {
	
		a();
		System.out.println( );
		S14_Static5 s1= new S14_Static5();
		s1.b();

	}

}
