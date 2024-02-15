package jpackageforGit;

public class aa {

	int roll;
	String Name;
	static String College ="IIT Bombay";
	 
	aa(int a,String b){
		roll=a;
		Name=b;
	}
	
	
public void result()
{
	System.out.println(roll+ " "+Name+" "+College);
}
	
	public static void main(String[] args) {
		
		aa a1=new aa(1,"om");
		a1.result();
		aa a2=new aa(2,"Jay");
		a2.result();
		
		aa.College="IIT Kharagpur";
		aa a3=new aa(3,"Jagdish");
		a3.result();
		
	}


	
}
