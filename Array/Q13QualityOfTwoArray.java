package Array;
		//Write a program to test the equality of two arrays 
public class Q13QualityOfTwoArray {

	public static void main(String[] args) 
	{
		int []a={11,22,33,44,55};
		int []b={11,22,33,44,55};
		int count=0;
		if(a.length==b.length)
		{
			for (int i = 0; i < b.length; i++) 
			{
				if(a[i]!=b[i])
					count++;
			}
			if(count==0)
				System.out.println("Elements of the Arrays is Same ");
			else
				System.out.println("Elements of the Arrays is Different");
		}
		else
			System.out.println("Not same");
	}
}
