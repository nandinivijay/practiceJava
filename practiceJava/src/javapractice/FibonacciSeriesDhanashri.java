package javapractice;

public class FibonacciSeriesDhanashri {

	public static void main(String[] args) {
		int t=10;
		int x=0;
		int y= 1;
		int z=x+y;
		for(int i=1;i<=t;i++) {
			
			int sum=x+y;
			x=y;
			y=sum;
			System.out.println(x);
		}
						

	}

}
