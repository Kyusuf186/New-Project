package practice_Prog;

public class NestedForloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
			
		}
		System.out.println(" ");
		
		for(int i=10;i<=100;i+=10) {
			System.out.print(i+" ");
			
		}
		System.out.println(" ");
		
		//Even Numbers
		for(int i=1;i<=10;i++) {
			if(i%2==0)
			System.out.print(i+" ");
				}
		System.out.println(" ");
		
		//Odd Numbers
		for(int i=1;i<=15;i++) {
			if(i%2!=0)
			System.out.print(i+" ");
				}
		System.out.println(" ");
		
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
			System.out.print(j+" ");
				}
			System.out.println(" ");
		}
		//Print 1 to 100
		int cntr=1;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
			System.out.print(cntr++ + " ");
				}
			System.out.println(" ");
		}
		
		//table 5
		for(int i=1;i<=10;i++) {
			
			
				
			System.out.println("5"+"x" +i+ "=" + (5*i));
		}
		
		//table 1 to 10
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
			System.out.println(i +"X"+j+ "=" +i*j);
				}
					}
		
	}

}
