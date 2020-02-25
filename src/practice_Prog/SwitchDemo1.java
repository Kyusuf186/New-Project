package practice_Prog;

import java.util.Scanner;

public class SwitchDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter country code");
		 String ccode=sc.nextLine();
		 //ccode=ccode.toLowerCase();
		 char cc=ccode.charAt(0);
		 
		 switch (cc) {
		 default:
				System.out.println("In-Valid");
				break;
				
		case 'u':
			System.out.println("United States Of Ameerica");
			break;
		case 'c':
			System.out.println("Canada");
			break;
		case 'i':
			System.out.println("india");
		 
		 
			/*
			 * switch (ccode) { default: System.out.println("In-Valid"); break;
			 * 
			 * case "usa": System.out.println("United States Of Ameerica"); break; case
			 * "can": System.out.println("Canada"); break; case "ind":
			 * System.out.println("india");
			 */

		
		}

	}

}
