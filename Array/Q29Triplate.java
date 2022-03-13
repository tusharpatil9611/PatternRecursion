package Array;
//) Write a program to find out count of triplets with sum smaller than given sum value.
public class Q29Triplate {

	public static void main(String[] args) 
	{
		int []a={5,1,3,4,7};
		
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				for (int k = j+1; k < a.length; k++)
				{
					if(a[i]+a[j]+a[k]<12)
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
				}
			}
		}
	}

}
