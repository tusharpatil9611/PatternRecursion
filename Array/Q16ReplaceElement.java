package Array;
// Write a program to replace 0 s with 1 s. e.g array is[0,1,0,1,0,1,0,1,0,1,0,1,0].

import java.util.Arrays;

public class Q16ReplaceElement {

	public static void main(String[] args) 
	{
		int a[]={0,1,0,1,0,1,0,1,0,1,0,1,0};
		
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==0)
				a[i]=1;
		}
		System.out.println(Arrays.toString(a));
	}

}
