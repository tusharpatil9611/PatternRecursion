package Array;
// Write a program to calculate sum and average of array elements(Variations)

public class Q1Cw {

	public static void main(String[] args) 
	{
		int [] a={12,32,56,85,12,23,32};
		int sum=0;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			count++;
		}
		System.out.println(sum);
		System.out.println("count "+count);
		System.out.println((double)(sum)/count);
	}

}
