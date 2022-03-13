package Array;
		// Write a program to print all the LEADERS in the array.
public class Q14LEADERS {

	public static void main(String[] args)
	{
		int []a={3,5,7,4,3,2,1};
		
		for (int i = 0; i < a.length; i++) 
		{
			int count=0;
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]<a[j])
				{
					count++;
					break;
				}
			}
			if(count==0)
				System.out.print(a[i]+" ");
		}
	}
}
