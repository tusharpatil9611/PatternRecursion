package Array;
// Write a program to separate even and odd numbers of an given array of integers. Put all even numbers first, and 
//then oddnumbers.
import java.util.Arrays;

public class Q17evenAndOdd {

	public static void main(String[] args) 
	{
			int a[]={43,55,78,34,77,90,67,87,21,32,25,52,74,421};
	
			for (int i = 0; i < a.length; i++) 
			{
				for (int j =0 ; j < a.length; j++) 
				{
					
					if( a[i]%2==0 && a[i]!=0)
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
