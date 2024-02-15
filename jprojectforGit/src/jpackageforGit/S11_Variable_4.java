package jpackageforGit;

public class S11_Variable_4 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,100};   //Interger Type Array
		String b[]= {"Om","Jay","Jagdish"};  //String type Array
		
		System.out.println(b[0]);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		System.out.println(a[6]);
		
		Object[] c= {"Ram",'S',10,10.5,23>54,};
		for(Object d:c)
		{
			System.out.print(" "+d);
		}
		System.out.println();
		System.out.println(a[10]);   //java.lang.ArrayIndexOutOfBoundsException
		
		
	}

}
