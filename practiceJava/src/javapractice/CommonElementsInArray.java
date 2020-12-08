package javapractice;

import java.util.HashSet;

public class CommonElementsInArray {

	public static void main(String[] args) {
		// [1,2,3,4,5]  [4,5,6,7,8]
		//[4,5]
		
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {4,5,6,7,8};
		HashSet<Integer> hs=new HashSet<>();
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++){
			
				 if(arr1[i]==arr2[j]) {
				hs.add(arr1[i]);
				hs.add(arr2[j]);
				
			}
			}
		}
		System.out.println(hs);
		
	}

}
