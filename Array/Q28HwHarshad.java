package Array;

import java.util.Arrays;

public class Q28HwHarshad {

	public static void main(String[] args) 
	{
		int []a={1,1,1,1,1,2,2,3,4};
		int []b={1,2,4};
		int rank=0;
		for (int i = 0; i < a.length; i++) 
		{
			int count=0;
			for (int j = i; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			boolean isPresent=true;
			for (int j = 0; j < b.length; j++)
			{
				if(a[i]==b[j])
				isPresent=false;
			}
			if(count>2 && isPresent==true || isPresent==false )
		
				rank++;
		}
		System.out.println(rank);
		int c[]=new int [rank];
		int index=0;
		for (int i = 0; i < a.length; i++)
		{
			int count=0;
			for (int j = i; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			boolean isPresent=true;
			for (int j = 0; j < b.length; j++) 
			{
				if(a[i]==b[j])
					isPresent=false;
			}
			if(count>2 && isPresent==true || isPresent==false)
				c[index++]=a[i];
		}
		System.out.println(Arrays.toString(c));
		
		
		
	}

}
