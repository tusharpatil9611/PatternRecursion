package Array;
	// Write a program sort array elements in using selection sort, merge sort.

import java.util.Arrays;
				//choose the minimum value and the compare this to the other
public class Q3CwSelectionSort {

	public static void main(String[] args) 
	{
		int[]a={21,45,67,31,11,43};
		
		for (int i = 0; i < a.length; i++) 
		{
			int min=i;
			for (int j = i+1; j < a.length; j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
