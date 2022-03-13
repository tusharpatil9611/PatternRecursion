package PatternRecursive;

public class Q37 {

	public static void main(String[] args)
	{
		int count=0;
		loopI(count,0);
	}

	private static void loopI(int count, int i) 
	{
		if(i<=5)
		{
			int start=count;
			int diff=5;
			loopJ(start,diff,i,0);
			count++;
			System.out.println();
			loopI(count, i+1);
		}
	}

	private static void loopJ(int start, int diff, int i, int j)
	{
		if(j<=5)
		{
			if(j-i<=0)
				System.out.print((char)(65+start)+" ");
			start=start+diff;
			loopJ(start, diff, i, j+1);
		}
	}

}
