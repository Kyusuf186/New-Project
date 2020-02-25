package practice_Prog;

class X{
	int i;
	X(){
		i=123;
	}
	X(int i){
		this.i=i;
	}
	X(String s){
		System.out.println(s);
	}
}
class Y extends X{
	Y(){
		super();
	}
	Y(int j){
		super(j);
	}
	Y(int a, int b,String s1,String s2,char ch){
		super(100);
		
	}
}

public class MultiInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		X x1=new X();
		X x2=new X(10);
		X x3=new X("Hello");
		Y y1=new Y();
		Y y2=new Y(234);
		Y y3=new Y(12,23,"Hello","Fellow",'y');
	}

}
