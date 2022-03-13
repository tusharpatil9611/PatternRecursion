package Array;
// Write a program to find transpose of a matrix.
import java.util.Arrays;

public class Q6CwTranspose 
{
	public static void main(String[] args)
	{
		int [][]a={{1,2,3},
					{4,5,6}};
		int [][]b= new int [a[0].length][a.length];
		
		for (int i = 0; i < b.length; i++)
		{
			for (int j = 0; j < b[0].length; j++)
			{
				b[i][j]=a[j][i];		//interchange the row and col.
			}
		}
		//b[0][0]=a[0][0];
		//b[0][1]=a[1][0];
				System.out.println(Arrays.deepToString(b));
				for (int i = 0; i < b.length; i++) 
				{
					for (int j = 0; j < b[0].length; j++) 
					{
						System.out.print(b[i][j]+" ");
					}
					System.out.println();
				}
	}
}
