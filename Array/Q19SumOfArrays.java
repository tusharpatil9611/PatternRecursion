package Array;
// Write a program calculate the average of the inner elements of an array
public class Q19SumOfArrays {

	public static void main(String[] args)
	{
		int [][]a={{1,2,3,6},
				   {4,5,6,3},
				   {7,8,9,5},
				   {7,5,2,3}};
		int sum=0;
		int count=0;
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				if(i==0 || j==0 || i==a.length-1 || j==a[i].length-1 )
				{}
				else
				{
					sum=sum+a[i][j];
					count++;
				}
			}
			
		}
		System.out.println(count);
		System.out.println("sum of the Arrays " +sum);
		System.out.println("Average of the inner element is "+(double)(sum/count));
	}

}
