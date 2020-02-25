package practice_Prog;

public class abc {

	public static void main(String[] args) {
		String str="Welcome to Java Session Java Session Session Java"; 
		String [] a=str.split(" ");
		boolean unique=false;
		//int count=1;
		for(int i=0;i<a.length-1;i++) {
		
			for(int j=i+1;j<a.length;j++) {
				if(a[i].equals(a[j])) {
					//count++;
				//a[j]="0";
					
					unique=true;
				}
			}
			//if(a[i]!="0") 
				if(unique)
			//{
				System.out.println(a[i]);
				//System.out.println(a[i]+" "+count);
				//count=1;
				unique=false;
				
			//}
		
	}
		}

}
