//Write a java program to generate first 20 even numbers and print the number of times the digit '2' is getting generated

//2 12 20 22 24 26 28 32-->9
package javapractice;

public class GenerateFirst20EvenNumbers_Prachi {

	public static void evennumbers()
	{		String s;
			String str=" ";
			int count=0;
			for(int i =1;i<=40;i++)
				{
					s=Integer.toString(i);
					if(i%2==0 &&  s.contains("2"))
					{
						str=str+s;
							
					}
			}
			System.out.println(str);
			char[] chars=str.toCharArray();
			for(char c:chars)
			{
				if(c=='2') {
					count++;
				}
					
			}
			System.out.println("The total nos of 2's in char array are:"+ count);
		
	}
	
	public static void main(String[] args) {
		
		evennumbers();
		
	}

}
