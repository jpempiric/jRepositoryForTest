package jpackageforGit;

public class A {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println();
		
		Object[] a = {"Hello",'A',12,10.5,23>46};
		for(Object b:a)
		{
			System.out.print(" "+b);
		}

	}

}
