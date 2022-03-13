package Array;
	// Write a program to find and display reverse of an array using third variable.
import java.util.Arrays;

public class Q5ReverseUsingThree {

	public static void main(String[] args)
	{
		int a[]={41,89,85,36,78,12};
		int i=0;
		int j=a.length-1;
		while(j>i) 
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
