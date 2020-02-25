package practice_Prog;

public class NestedForLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int val=10; for(int i=1;i<=3;i++) { for(int j=1;j<=3;j++) {
		 * System.out.print(val +" "); val+=10; } System.out.println(" "); }
		 */
		
		
		/*
		 * int counter=1; for(int i=1;i<=3;i++) { for(int j=1;j<=3;j++) {
		 * System.out.print(counter++ +" "); //val+=10; } System.out.println(" "); }
		 */
		 
		//Right angled Trinagle 
		/*
		 * for(int i=1;i<=5;i++) { for(int j=1;j<=i;j++) {
		 * 
		 * System.out.print(j +" "); } System.out.println(" "); }
	
		 */
		/*
		 * int cntr = 1; for (int i=1;i<=5;i++) { for(int j=1;j<=i;j++) {
		 * System.out.print(cntr++); } System.out.println(); }
		 */
		
		//Diagonal
		/*
		 * for (int i=1;i<=5;i++) { for(int j=1;j<=5;j++) { if(i==j)
		 * System.out.print("x"); else System.out.print(" "); } System.out.println(); }
		 */
		
		
		/*
		 * for (int i=1;i<=5;i++) { for(int j=1;j<=5;j++) { if(i==j || i+j==6)
		 * System.out.print(j);//System.out.println(i);//System.out.println("x"); else
		 * System.out.print(" "); } System.out.println(); }
		 */
		
		//Equilateral Triangle
		
		int cntr=1;
		for (int i=1;i<=4;i++) {
			
			  for(int k=1;k<=4-i;k++) {
			  
			  System.out.print(" "); 
			  }
			 
			for(int j=1;j<=i;j++) {
				System.out.print  (cntr++ + " ");
			}
			System.out.println();
		}
		
		int l=1;
				while(true) {
			System.out.println(l++);
			if(l==100)
				break;
			
		}
		int m=1;
				do {
					System.out.println(m++);
				}
				while(m<=100);
					
				
  }
	
}