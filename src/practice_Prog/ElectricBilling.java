package practice_Prog;

import java.util.Scanner;

public class ElectricBilling {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of units");
		 int units=sc.nextInt();
		 System.out.println("Enter arrears if any");
		 double arrears =sc.nextDouble();
		 double amount=0.0;
		 double discount=0.0;
		 double fineamount=0.0;
		 double totalamount=0.0;
		
		 if(units>0 &&units<=50) {
			 amount=(units*1.20);
			 //System.out.println(amount);
		 }
			 else if(units>50 &&units<=100) {
				 amount=(50*1.20)+(units-50)*2.40;
				 //System.out.println(amount);
				 }
			 else if(units>100 &&units<=150) {
				 amount=(50*1.20)+(50*2.40)+(units-100)*3.60;
				 //System.out.println(amount);
			 }
			 else if(units>150) {
				 amount=(50*1.20)+(50*2.40)+(50*3.60)+(units-150)*4.80;
				 //System.out.println(amount);
			 }
		 if(units>200) {
			 discount= amount*0.05;
			 if (discount >200)
				 discount=200;
		 }
		 if(arrears>=0) {
			 fineamount =arrears*0.1;
		 totalamount=amount+arrears+fineamount-discount;
		 }
		 
		
		 
		 
	System.out.println(totalamount);
		 }
}

