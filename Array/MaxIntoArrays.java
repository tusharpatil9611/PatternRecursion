package Array;

public class MaxIntoArrays 
{
	public static void main(String[] args) 
	{
		int a[]={31,43,78,99,56,77};
		int max=Integer.MIN_VALUE;		
		
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println(max+" ");
	}
}
