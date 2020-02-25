package practice_Prog;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter number to check \n");
int num=sc.nextInt();
boolean flag=true;
for(int i=2;i<=num/2;i++) {
	if(num%i==0) {
		flag=false;
		break;
			}
}
if (flag) {
	System.out.println(num + " is prime");
}
	else
	{
		System.out.println(num + " is not prime");
}
		
	}

}
