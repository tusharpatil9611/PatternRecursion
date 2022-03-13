package Array;
import java.util.Arrays;
//Write a program to remove the duplicate elements of a given array and return the new length of the array.
public class Q11RemoveDublicate 
{
	public static void main(String[] args) 
	{
		int []a={4,4,5,5,6,7,7,7,4,5,2,2,2};
		int ckt=0; 
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					ckt++;
					break;
				}
			}
		}
		System.out.println(ckt);
		int []b=new int[a.length-ckt];
		int index=0;
		for (int i = 0; i < a.length; i++)
		{
			int counter=0;
			for (int j = 0; j < b.length; j++)
			{
				if(a[i]==b[j])
					counter++;
			}
			if(counter==0)
			{
				b[index++]=a[i];
			}
		}
		System.out.println(Arrays.toString(b));
		for (int i = 0; i < index; i++) 
		{
			System.out.print(b[i]+" ");
		}
	}
}
