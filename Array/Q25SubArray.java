package Array;

public class Q25SubArray {

	public static void main(String[] args) 
	{
		int a[]={3,7,90,20,5,50,40};
		int k=3;
		double min=Integer.MAX_VALUE;
		for (int i = 0; i < a.length-k+1; i++)
		{
			int sum=0;
			for (int j = i; j <i+k; j++) 
			{
				sum=sum+a[j];
			}
			double avg=((double)sum/k);
			//System.out.println(avg);
			if(avg<min)
			{
				min=avg;
			}
		}
		System.out.println(min);
	}

}
