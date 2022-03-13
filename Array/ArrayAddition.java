package Array;

public class ArrayAddition {

	public static void main(String[] args)
	{
		int []a={12,45,78,89,56,23,31};
		int sum=0;
		for (int i = 0; i < a.length; i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Arrays sum "+sum);
	}

}
