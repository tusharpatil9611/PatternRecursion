package Array;
import java.util.Arrays;
public class inc {
	public static void main(String[] args) 
	{	
		int[] a={5,1,3,6,8,2,9,0};
		int[] inca=new int[a.length];
		int[] deca=new int[a.length];
		int ince=0;
		int dece=0;
		if(a[0]>a[1])
		{
			inca[0]=a[1];
			deca[0]=a[0];
			ince=a[1];
			dece=a[0];
		}
		else
		{
			inca[0]=a[0];
			deca[0]=a[1];
			ince=a[0];
			dece=a[1];
		}
		int inccnt=1;
		int deccnt=1;
		for (int i = 2; i < a.length; i++) 
		{
			if(a[i]>ince)
			{
				inca[inccnt++]=a[i];
				ince=a[i];
			}
			else if(a[i]<dece)
			{
				deca[deccnt++]=a[i];
				dece=a[i];
			}
			else
			{
				System.out.println(-1);
				System.exit(0);
			}
		}
		for (int i = 0; i < inccnt; i++)
		{
			System.out.print(inca[i]+" ");
		}
		System.out.println();
		
		for (int i = 0; i < deccnt; i++)
		{
			System.out.print(deca[i]+" ");
		}
	}
}
