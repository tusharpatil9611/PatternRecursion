package Array;
			//Write a program to rotate an array to the left. 
import java.util.Arrays;

public class Q23RightShift {

	public static void main(String[] args)
	{
		int []a={1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(a));
		int temp=a[a.length-1];
		for (int i = a.length-1; i >=1; i--) 
		{
			a[i]=a[i-1];
		}
		a[0]=temp;
		System.out.println(Arrays.toString(a));
	}

}
