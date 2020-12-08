//Write a program to see the output as 0, 1, 1, 2, 3…..
	
/* num1=0,num1=1,num1=1,num1=2,num1=3
 * sum =1,sum=2,sum=3,sum=5
 * num1=1,num1=1,num1=2,num1=3
 * num2=1,num2=2,num2=3,num2=5
 * 
 */

package interviewprepqa1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FibonacciSeries {
	
	public void fibonacciseries() {
		
		int count=10,n1=0,n2=1;
		System.out.println("The fibonacci series of "+ count);
		for(int i=1;i<=count;i++)
		{
			System.out.print(n1);
			System.out.println(          );
			int n3=n1+n2;
			n1=n2;
			n2=n3;
		}
	}

@Test
public void test()
{
	fibonacciseries();
}
}


//public int occurence(int a[])
//{
//	
//	Map<Integer,Integer> hs_map= new HashMap<Integer,Integer>();
//	for(int i=0;i<a.length;i++){
//		if(!hs_map.containsKey(1) {
////			hs_map.put(a[i], 1);
////		}else {
////			hs_map.put(a[i], hs_map.get(a[i])+1);
////			
////		}
////	}
////	int value=0;
////		for(Entry <Integer,Integer> hs_temp :hs_map.entrySet()){
////			int maxValueInMap = (Collections.max(hs_map.values()));
////			if(hs_temp.getValue()==maxValueInMap) {
////				System.out.println("The Number is: "+ hs_temp.getKey()+" and it repeats " + hs_temp.getValue() +" times");
////				value=hs_temp.getKey();
////			}
////		}
////	
////	return value ;
////	
////}
//
////@Test
////public void test()
////{
////	int a[]= {2, 4,5,5,6,6,7,7,2,2};
////	int value = max(a);
////	Assert.assertEquals(value, 2);
////}




