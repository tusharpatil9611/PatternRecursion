package Array;
public class Q10MaxNum
{
	public static void main(String[] args) 
	{
		int []a={2,34,54,34,759,004};
		int max=Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Max no is "+max);
	}
}
