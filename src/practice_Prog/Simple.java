package practice_Prog;


abstract class S{
	int i=5;
	void sleep() {
		System.out.println("Sleeping");
	}
	void eat() {
		System.out.println("eating");
	}
	
  void show() {
		System.out.println("Hello");
	}
}
class F extends S{
	int i=6;
	void show() {
		System.out.println("Good Morning");
	}
	
	void bark() {
		System.out.println("Bow-Bow");
	}
	void wagTail() {
		System.out.println("waging Tail");
	}
}
public class Simple {

	public static void main(String[] args) {
		S s1=new F();
		s1.show();
	System.out.println(s1.i);
		s1.sleep();
		s1.eat();
	}
	


}
