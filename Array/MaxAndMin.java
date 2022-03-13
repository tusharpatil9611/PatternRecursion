package Array;
public class MaxAndMin
{
	public static void main(String[] args)
	{
		int []a={14,87,95,26,36,14,86,322,223,787};
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("Addition is "+(max+min));
	}
}
