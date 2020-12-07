package javapractice;

public class AcceptIntArrayReturnIntegersDJ {

	int[] arr= {7,4,5,8,8,9};
	public static void main(String[] args) {
		
		
		// write program to generate function that accepts integer array and returns number
		int arr[]= {7,4,5,8,8,9};
		
		for(int i=0;i<arr.length;i++) {
		
		System.out.print(arr[i]);
		}
	}
	
	
	public int returnNumber(int[]arr) {
		
		int i=0;
		for( i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]);
			}
		
		return arr[i];
	}

}
