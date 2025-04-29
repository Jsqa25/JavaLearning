package javaprog;

public class OverloadingHelp {
	
		   public int findarea (int l, int b) {
		           int var1;
		           var1 = l * b;
		           return var1;
		   }
		   public int findarea (int l, int b, int h) {
		           int var2;
		           var2 = l * b * h;
		           return var2;
		   }
		   public static void main(String args[]){
		       
		        OverloadingHelp o=new OverloadingHelp();
		        int area=o.findarea(1,2,3);
		        System.out.println(area);
		    }

}
