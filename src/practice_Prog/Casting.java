package practice_Prog;

class Animal{
	
}
class Mammal extends Animal{
	
}
class Monkey extends Mammal {
	
}
public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1=new Animal();
		Mammal m1=new Mammal();
		Monkey m11=new Monkey();
		
		//Upcasting
		Animal a2=new Mammal();
		Animal a3=new Monkey();
		Mammal m2=new Monkey();
		Animal a4=new Monkey();
		//downcasting
		Mammal m3=(Mammal)a2;
		Monkey m33=(Monkey)m2;
		Monkey m44=(Monkey)a4;
	}

}
