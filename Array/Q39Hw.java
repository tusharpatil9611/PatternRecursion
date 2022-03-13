package Array;

public class Q39Hw {

	public static void main(String[] args) 
	{
		int []a={5, 1, 3, 6, 8, 2, 9,0 };
		int []dec=new int [a.length];
		int []inc=new int[a.length];
		if(a[0]>a[1])
		{
			inc[0]=a[1];
			dec[0]=a[0];
		}
		else
		{
			inc[0]=a[0];
			dec[0]=a[1];
		}
		int incCount=1;
		int decCount=1;
		for (int i = 2; i < a.length; i++) 
		{
		if(a[i]>inc[incCount-1])
			{
			inc[incCount++]=a[i];
			}
		else if(a[i]<dec[decCount-1])
			{
			dec[decCount++]=a[i];
			}
		else
			{
			System.out.println(-1);
			}
		}
		for (int i = 0; i < incCount; i++)
		{
			System.out.print(inc[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < decCount; i++) 
		{
			System.out.print(dec[i]+" " );
		}
		
		

	}

}
