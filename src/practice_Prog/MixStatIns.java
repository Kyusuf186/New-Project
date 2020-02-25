package practice_Prog;

class A {
	A(){
		System.out.println("Constructor of A Class");
	}
	static {
		System.out.println("SIB of A class");
	}
	
	{
		System.out.println("IIB of A class");
	}
}


public class MixStatIns {
	static {
		System.out.println("SIB of MixStatIns");
	}
	{
		System.out.println("IIB of MIXStatIns");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main Method starts");
		A a1=new A();
		MixStatIns m1=new MixStatIns();
		A a2=new A();
		System.out.println("Main Method Ends");
	}
	

}

