package Array;

public class CharS1S2 {

	public static void main(String[] args)
	{
		char []S1 ={'A','S','W','E','S','A','E','W','l'};
		char []S2 ={'d','e','w','e','r','q','u','k'};
		char []S3=new char[S1.length+S2.length];
		
		int count=0;
		int count1=S1.length;
		for (int i = 0; i < S3.length; i++) 
		{
			if(i<S1.length)
			{
				S3[count++]=S1[i];
			}
			if(i<S2.length)
			{
				S3[count1++]=S2[i];
			}
		}
		for (int i = 0; i < S3.length; i++) 
		{
			System.out.print(S3[i]+" ");
		}
	}
}
