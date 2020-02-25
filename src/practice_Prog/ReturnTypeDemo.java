package practice_Prog;

class Orange {
	
}


public class ReturnTypeDemo {

	public static void main(String[] args) 
	{
		int a=2;
		int b=5;
		int c=a++ + b++ + test(b++);
		
		
		
		System.out.println(print2());
		System.out.println(print());
		//print1();
		System.out.println (ismarried());
		//wish(null);
		System.out.println(getOrange());
		System.out.println(getApple());
		System.out.println(wish());
		System.out.println(getmarks());
		System.out.println("a= " +a);
		System.out.println("b= "+b);
		System.out.println("c="+ c);

System.out.println(num(100,200)+"\n");


System.out.println(wish(" yusuf"));
		
	}
		
		 
	static void print1() 
	{
		return;
	}
	
	static byte print() 
		 {
			 byte b=25;
			 return b;
	}
	
	static int print2() {
		//int i=200;
		//return i;
		return 100;
	}
	
	static boolean  ismarried() {
		boolean status =false;
		return status;
	}
	
	static String wish()  //String wish(String "Hello") return Hello +"Yusuf";
	{
		String name="Hello";
		 return name + "yusuf";
	}
	
	
	static Orange getOrange() {
		return new Orange(); 
	}

	static Apple getApple() {
	Apple a1=new Apple();
	return a1;
}

static int[] getmarks()
{
	int marks[] = {70,80,90,100};
	return marks;
}
 
static int test(int a) 
{
	a++;
	return a++;
}



static int num(int number1,int number2)
{
int addition=number1+number2;
return addition;
	
}

static String wish(String name) {
String str="Hello" +name;
return str;
}



}
	

