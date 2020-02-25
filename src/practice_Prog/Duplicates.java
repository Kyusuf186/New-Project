package practice_Prog;

public class Duplicates {

	public static void main(String[] args) {
		String str="abcdefaaabbbcccdddeeefff";

		//String str1=str.replace(" ", "");
		//boolean duplicate=false;
		int count=1;
		char []c=str.toCharArray();
		 for(int i=0;i<c.length-1;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					// duplicate=true;
					
					count++;
					 c[j]=' ';
				}
			}
			if(c[i]!=0) {
				
				System.out.print(c[i]);
				count=1;
				
				//duplicate=false;
				
			}
			
		}
		
	}
}
