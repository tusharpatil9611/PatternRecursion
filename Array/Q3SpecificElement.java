package Array;

import java.util.Arrays;

public class Q3SpecificElement {

	public static void main(String[] args)
	{
		int []a={6,7,8,3,4};
		
		int num=8;
		int index=0;
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==num)
				count++;
		}
	//	System.out.println(count);
		int []b=new int [a.length-count];
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]!=num)
				b[index++]=a[i];
		}
		System.out.println(Arrays.toString(b));
		

	}

}
