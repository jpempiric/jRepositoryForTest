package jpackageforGit;

public class S12_Variable_8 {

	int b=10; //Global Variable
static int c=5; // Static Variable
	
	public static void main(String[] args) {
		
		int a=6;   //Local Variable
		
	//Non-Static Variable Calling (Global)
		S12_Variable_8 v8=new S12_Variable_8();
		System.out.println(v8.b);
		
	//Static Variable Calling 
		System.out.println(c);
		System.out.println(v8.c);
		System.out.println(S12_Variable_8.c);
		
		
		System.out.println(a);
		a();  //Calling Static Method
		b();   //Calling Static Method
	}
		public static void a() {
			int f=15;   //Local Variable
			System.out.println(f);
		}
		public static void b() {
			int g=40;
			System.out.println(g);
		}
		

}
