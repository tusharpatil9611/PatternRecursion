package Array;
	//Write a program to get the difference between the largest and smallest values in an array of integers.
public class Q15DiffBetMaxandMin {

	public static void main(String[] args) 
	{
		int a[]={24,87,24,55,78,41,7};
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		System.out.println(max-min);
	}

}
