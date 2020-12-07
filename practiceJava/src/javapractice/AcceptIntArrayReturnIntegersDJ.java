package javapractice;

public class AcceptIntArrayReturnIntegersDJ {

	public static void main(String[] args) {
		// T
		int arr[]= {7,4,5,8,8,9};
		
		for(int i=0;i<arr.length;i++) {
		
		System.out.print(arr[i]);
		}
	}
	
	
	public int returnNumber(int[]arr) {
		arr= {7,4,5,8,8,9};
		int i=0;
		for( i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]);
			}
		
		return arr[i];
	}

}
