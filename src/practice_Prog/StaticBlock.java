package practice_Prog;

public class StaticBlock {
	static {
		 int i = 100;
		System.out.println("Static Block 1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlock sb=new StaticBlock();
		
		System.out.println("Main method");
		display();
		sb.print();
		//StaticBlock.display();
		
	}

	public static void display() {
		
		System.out.println("Static Method");
	}

	static int i = 10;

	void print() {
	
		System.out.println("Instance Mehtod");

	}
	
	{
		System.out.println("Instance Block");
	}
}