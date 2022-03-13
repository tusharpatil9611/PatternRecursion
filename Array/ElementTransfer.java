package Array;

import java.util.Arrays;

public class ElementTransfer {

	public static void main(String[] args) 
	{

		int [] a={12,43,54,65,45};
		int [] b=new int [a.length];
		
		for (int i = 0; i <a.length ; i++) 
		{
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(b));

	}

}
