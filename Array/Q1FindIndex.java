package Array;
import java.util.*;
public class Q1FindIndex {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num ");
		int num =sc.nextInt();
		int []a={41,98,65,24,33,78};
		int count=0;
		
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]==num)
				count=i;
		}
		if(count==0)
			System.out.println("Element is not Found");
		else
			System.out.println("Element found at index Position "+count);
	}

}
