package jpackageforGit;

public class S14_Static4 {

	public static void main(String[] args) {
		S14_Static3 s3=new S14_Static3(1,"John");
		S14_Static3 s4=new S14_Static3(2,"Peter");
		S14_Static3 s5=new S14_Static3(3,"Alex");
		
		s3.getResult();
		s4.getResult();
		s5.getResult();

		System.out.println();
		
		S14_Static3.college ="IIT Kanput";
		s3.getResult();
		s4.getResult();
		s5.getResult();

	}

}
