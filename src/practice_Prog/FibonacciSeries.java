package practice_Prog;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n1,n2,n3;
		n1=0;
		n2=1;
		n3=1;
		//System.out.println(n1);
		//System.out.println(n2);
		int maxnum=100;
		while(n1+n2<=maxnum) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}
}
