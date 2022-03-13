package PatternRecursive;

public class Q71 {

	public static void main(String[] args) 
	{
		loopI(0);
	}

	private static void loopI(int i) 
	{
		if(i<=8)
		{
			int count=1;
			loopJ(count,i,0);
			System.out.println();
			loopI(i+2);
		}
	}

	private static void loopJ(int count, int i, int j) 
	{
		if(j<=8)
		{
			if(j-i<=0)
		   {
			System.out.print(count);
			if(j<i/2)
			count++;
			else
			count--;
			loopJ(count, i, j+1);
		   }
		}
	}

}
