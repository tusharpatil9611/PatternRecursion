package Array;

import java.util.Arrays;

public class Q4Cw {

	public static void main(String[] args)
	{
		int []a={25,62,12,39,88,45,62,1,22};
		
		for (int i = 0; i < a.length; i++)
		{
			int temp=a[i];
			int j=i;
			while(j>0 && a[j-1]>temp)
			{
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
		}
		
		
		System.out.println(Arrays.toString(a));
	}

}
