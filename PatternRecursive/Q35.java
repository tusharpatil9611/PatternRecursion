package PatternRecursive;

public class Q35 {
static int count=0;
	public static void main(String[] args)
	{
		loopI(0);
	}

	private static void loopI( int i)
	{
		if(i<=5)
		{
			loopJ(i,0);
			System.out.println();
			loopI( i+1);
		}
	}

	private static void loopJ( int i, int j) 
	{
		if(j<=5)
		{
			if(j-i<=0)
			{
				System.out.print((char)(65+count++));
			}
			
			loopJ( i, j+1);
		}
	}

}
