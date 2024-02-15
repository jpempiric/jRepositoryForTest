package jpackageforGit;

public class S27_TypeCastingNarrowing {

	public static void main(String[] args) {
		
		double d=5.7;
		int i=(int) d;
		System.out.println(d);  //5.7
		System.out.println(i);  //5
		
		// String to integer Conversion 
		String s="10";
		int j=Integer.parseInt(s);
		System.out.println(j);
		
		//Integer to String Conversion
		int k=20;
		String t=String.valueOf(k);
		System.out.println(t);
		
		
		
	}

}
