package Array;

public class Q4CopyOFArray {

	public static void main(String[] args) 
	{
		int a[]={77,42,98,62,12,45};
		int b[]=new int[a.length];
		for (int i = 0; i < a.length; i++) 
		{
			b[i]=a[i];
		}
		for (int i = 0; i < a.length; i++) 
		{
		System.out.print(b[i]+" ");	
		}
	}

}
