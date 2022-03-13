package Array;

import java.util.Arrays;

public class Q7UniquePair {
	public static void main (String[]arg)
	{
		int []a={1,1,2};
		int count=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j =0; j < i; j++)
			{
				if(a[i]==a[j])
					count++;
				break;
			}
		}
		System.out.println(count);
		int b []=new int [a.length-count];
		int index=0;
		for (int i = 0; i < a.length; i++)
		{
			int ckt=0;
			for (int j = 0; j < b.length; j++)
			{
				if(a[i]==b[j])
					ckt++;
			}
			if(ckt==0)
				b[index++]=a[i];
		}
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b.length; j++)
			{
				System.out.println(b[i]+" "+b[j]);
			}
		}
		
	}

}
