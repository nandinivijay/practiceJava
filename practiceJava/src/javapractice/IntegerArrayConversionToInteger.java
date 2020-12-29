package javapractice;

public class IntegerArrayConversionToInteger {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };



		for(int temp:arr) {
			int value = Integer.valueOf(temp);


			System.out.print(value);
		}


	}
}
