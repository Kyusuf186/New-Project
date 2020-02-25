package practice_Prog;

class P{
	int i,j;
	
	P(int i,int j){
		this.i=i;
		this.j=j;
		//System.out.println("i="+i +" j= "+j);
		
	}
	void print() {
		System.out.println("i= "+i);
		System.out.println("j="+j);
	}
}
class D extends P{
	int a;
	int b;
	D(){
		super(1,2);
	}
	D(int a,int b){
		super(888,999); //By default system will create a constructor of super/parent class
		this.a=a;
		this.b=b;
		//System.out.println( "a = "+a +" b = " + b);
	}
	
	void disp() {
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	
}
class E extends D{
	int x;
	int y;
	E(){
		super(222,333);
	}
	E(int x,int Y){
		super(555,666);
		this.x=x;
		this.y=y;
		}
}

public class Inheritance {

	public static void main(String[] args) {
		
	
	P p1=new P(200,300);
	p1.print();
	System.out.println("------------");
	D d1=new D(10,20);
	d1.disp();
	System.out.println("------------");
	E e1=new E();
	E e2=new E(55,66);
	e1.disp();
	e1.print();
	System.out.println("-------------");
	e2.print();

	}

}
