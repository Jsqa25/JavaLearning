package javaprog;

class HumanBeing {
	static int counter=10;
	int nonstatic;
	public int walk (int distance, int time) {
            int speed = distance / time;
            return speed;
     }
    public void test(){
    	 System.out.println("tet");
    }
    public static void parentStaticMethod()
    {
    	 System.out.println("public static method"+counter );
    	 //cannot make reference to non static variable
    	// System.out.println("non static method"+nonstatic );
    	//cannot make reference to non static method
    	// test();
    }
}
class Athlete extends HumanBeing {
	static int counter=20;
    public int walk(int distance, int time) {
            int speed = distance / time;
            speed = speed * 2;
            return speed;
    }
    public static void childStaticMethod()
    {
    	 System.out.println("child static method" +counter);
    }
}

public class OverRidingExample {
	   public static void main(String args[]){
	       
		   Athlete o=new Athlete();
		   o.test();
		   Athlete.parentStaticMethod();
		   Athlete.childStaticMethod();
		   int speed=o.walk(1000,200);
	        System.out.println(speed);
		   HumanBeing h=new HumanBeing();
		    speed=h.walk(1000,200);
		    h.test();
		    h.parentStaticMethod();
		 
	        System.out.println(speed);
		   HumanBeing ha=new Athlete();
	         speed=ha.walk(1000,200);
	         ha.parentStaticMethod();
	        System.out.println(speed);
	    }
}
