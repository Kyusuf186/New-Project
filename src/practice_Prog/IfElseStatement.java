package practice_Prog;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter your marks \n");
		int marks=sc.nextInt();
		if(marks > 50 && marks < 60)
			System.out.println("pass");
		else if(marks>=60 && marks<75)
			System.out.println("FirstClass");
		else if(marks>=75 &&marks<=100)
			System.out.println("Distiction");
		else if(marks>=0 &&marks<=50)
			System.out.println("Fail");
		else
			System.out.println("Invalid");
		

	}

}
