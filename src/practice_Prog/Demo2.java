package practice_Prog;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		int y=7;
		boolean res= x==y;
		
		/*
		 * System.out.println(res); System.out.println(x==y); System.out.println(y==7);
		 * System.out.println(x==7);
		 */
		res=x>y;
		System.out.println(res);
		//x+=5;
		res=x<=y;
		System.out.println(res);
		
		
		int m=50;
		int n=m>=50?100:200;
		System.out.println(n);
		
		char ch=12.34 ==12.3?'A':'B';
		System.out.println(ch);
		                                             
		int marks =55;
	
		String Result =marks>100?"pass":"fail";
		System.out.println(Result);

	}

}
