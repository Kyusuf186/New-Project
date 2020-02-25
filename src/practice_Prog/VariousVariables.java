package practice_Prog;

public class VariousVariables {

	static int i=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.out.println("i = " +i); 
		  i=20; 
		  System.out.println("i = "+i);
		  i=30;
		  System.out.println("i = "+i); 
		  System.out.println("i =" + VariousVariables.i);
		  VariousVariables.i=40; 
		  System.out.println("i =" + VariousVariables.i); 
		  i=500;
		  System.out.println("i =" + i); 
		  { 
			  int j=100; 
			  System.out.println("j ="+ j);
		  System.out.println("i =" + VariousVariables.i);
		  }
		 
		  //System.out.println("j =" + j); Out of scope not accessable
		
	
		
		

	}

}
