package Array;

public class Q9SecondLargest {

	public static void main(String[] args) 
	{
		int []a={85,25,98,74,32,45};
		int max=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}	
			System.out.println(max);
			for (int i = 0; i < a.length; i++)
			{
				if(a[i]!=max && a[i]>max2)
				{
					max2=a[i];
				}
			}
			System.out.println(max2);
		}
	}


