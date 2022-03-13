package Array;

public class Q21Subtraction {

	public static void main(String[] args)
	{
		int [][]a={{9,4,12},{4,5,15},{7,8,9}};
		int [][]b={{7,3,6},{2,3,9},{7,2,3}};
		int [][]c=new int [a.length][a[0].length];
		
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = 0; j < c.length; j++)
			{
				c[i][j]=a[i][j]-b[i][j];
			}
		}
		for (int i = 0; i < c.length; i++)
		{
			for (int j = 0; j < c.length; j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
