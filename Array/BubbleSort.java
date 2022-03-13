package Array;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args)
	{
//			int []a={21,21,45,67,31,11,43};
//			
//			
//			for (int i = 0; i < a.length; i++)
//			{
//				for (int j = 0; j < a.length-1; j++)
//				{
//					if(a[j]>a[j+1])
//					{
//						int temp=a[j];
//						a[j]=a[j+1];
//						a[j+1]=temp;
//					}
//				}
//			}
//			System.out.println(Arrays.toString(a));
			
			int []b={12,3,99,15,62,97,5,65,2};
			for (int i = 0; i < b.length; i++) 
			{
				for (int j =0; j < b.length-1; j++) 
				{
					if(b[j]>b[j+1])
					{
						int temp=b[j];
						b[j]=b[j+1];
						b[j+1]=temp;
					
					}

				}
			}

			System.out.println(Arrays.toString(b));
			
			
	}

}
