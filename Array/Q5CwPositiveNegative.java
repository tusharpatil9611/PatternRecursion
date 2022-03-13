package Array;
// Write a program to arrange the elements of an given array of integers where all positive integers appear before all 
//the negative integers.
import java.util.Arrays;
public class Q5CwPositiveNegative {
	public static void main(String[] args) 
	{
		int []a={12,41,-23,-11,25,30,-6};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++)
			{
				if(a[i]>0)
				{
				int	temp=a[i];
				a[i]=a[j];
				a[j]=temp;				
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
