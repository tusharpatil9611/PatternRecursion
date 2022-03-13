package Array;
import java.util.*;
public class Q2ElementSearching {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the to Search");
		int num=sc.nextInt();
		int [] a={12,7,86,6,29,972,2122,20};
		
		int count=-1;
		
		for (int i = 0; i < a.length; i++)
			{
				if(num==a[i])
				count=i;
			}
		if(count==-1)
			System.out.println("Element not Found");
		else
			System.out.println("Element Found At index Position "+count);
	}

}
