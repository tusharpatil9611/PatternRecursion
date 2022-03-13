package Array;
import java.util.Scanner;
public class ArrayInputFromUser {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Matrix with row and coloum");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int [][]a=new int [row][col];
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				a[i][j]=sc.nextInt();	
			}
			System.out.println();
		}
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
