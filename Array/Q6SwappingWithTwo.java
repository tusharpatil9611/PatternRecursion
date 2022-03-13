package Array;

import java.util.Arrays;

public class Q6SwappingWithTwo {

	public static void main(String[] args)
	{
		int a[]={45,98,35,69,78,12};
		int i=0; 
		int j=a.length-1;
		for (; j > i;)		//Second Way while(j>i)
		{
			int temp=a[i];
			a[i]=a[i]+a[j];
			a[j]=a[i]-a[j];
			a[i]=a[i]-a[j];
			i++;
			j--;
		}
		System.out.println(Arrays.toString(a));
		
	}

}
