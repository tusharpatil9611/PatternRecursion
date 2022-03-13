package Array;
import java.util.Arrays;
public class NormalSort 
{
	public static void main(String[] args) 
	{
		int [] a={21,45,67,31,11,43,9,8,99,4};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++)
			{
			if(a[j]<a[i])
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
