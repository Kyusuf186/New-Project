package practice_Prog;

import java.util.Arrays;
import java.util.Collections;

public class Store_AnotherArray {

	public static void main(String[] args) {
		
		
		Integer a[]= {2,3,4,5};
		/*
		 * Arrays.sort(a); System.out.println(Arrays.toString(a));
		 */
		
		/*
		 * for(int i=0;i<a.length-1;i++) { for(int j=i+1;j<a.length;j++) {
		 * //if(a[i]>a[j]) //Ascending order if(a[i]<a[j])//Descending order { int
		 * temp=a[i]; a[i]=a[j]; a[j]=temp; } } }
		 * System.out.println(Arrays.toString(a));
		 */
		
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
		
	}

}
