package practice_Prog;

public class FirstTenPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=2;
		int count=0;
		boolean flag;
		while(count<10) {
			flag=true;
			for (int j=2;j<num;j++) {
				
				if (num%j==0) {
					flag=false;
					break;
				}
					
			}
			if (flag) {
				System.out.println(num +" ");
				count++;
			}
			num++;
				
		}
	}

}
