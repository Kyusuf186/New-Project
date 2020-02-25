package practice_Prog;

public class VariableMethod {
	static int i=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			VariableMethod.test();   //calling method to print output
			
			Banana b1=new Banana();
			b1.print();
			b1.j=200;
			b1.print();
			new Banana().j=300;
			b1.print();
			
			}


	static void test() {
		System.out.println(VariableMethod.i);//System.out.println(i);
	}
	
}
	class Banana{
		int j=100;
		
		void print() {
			System.out.println("j="+j);
		}
	}

