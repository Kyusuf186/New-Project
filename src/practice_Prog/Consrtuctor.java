package practice_Prog;

class C{
	int i;
	C(int a){
		System.out.println("Constructor of C Class");
		i=a;
	}
}

public class Consrtuctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c1=new C(100);
		System.out.println(c1.i);
		C c2=new C(200);
		System.out.println(c2.i);
	}

}
