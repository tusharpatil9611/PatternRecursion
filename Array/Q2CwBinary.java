package Array;
	//  Write a program to perform binary search.

import java.util.Scanner;

public class Q2CwBinary {
	public static void main(String[] args) 
	{
		int []a={12,22,33,45,65,78,89,99};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Element ");
		int num=sc.nextInt();
		int start =0;
		int end=a.length-1;
		
		while(true)
		{
			int mid=(start+end)/2;
			if(a[mid]==num)
			{
				System.out.println("no is "+mid);
				break;
			}
			else if(num>a[mid])
			{
				start =mid+1;
			}
			else
			{
				end=mid-1;
			}
			if(end<start)
			{
				System.out.println("not");
				break;
			}
		}
	}
}
