package javapractice;

public class IntArrayToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6,7,8,9};
		int count=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			count=count*10 + arr[i];
		}
		
		System.out.println(count);
	}

}
