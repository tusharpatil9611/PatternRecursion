package Array;
//Write a program to print the addition of two matrices.
public class Q20AdditionOfTwoMatrices {
	public static void main(String[] args)
	{
		int [][]a={{1,2,3},
				{4,5,6},
				{7,8,9}};
		int [][]b={{11,12,13},
				{14,15,16},
				{17,18,19}};
		int [][]c=new int[a.length][a[0].length];
		
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = 0; j < c.length; j++)
			{
				c[i][j]=a[i][j]+b[i][j];
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
