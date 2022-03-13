package PatternRecursive;

public class Q26 {

	public static void main(String[] args) 
	{
		loopI(0);
	}
	private static void loopI(int i) 
	{
		if(i<=4)
		{
			loopJ(i,0);
			System.out.println();
			loopI(i+1);
			
		}
	}
	private static void loopJ(int i, int j)
	{
			if(j<=4)
			{
				if(j-i<=0)
					System.out.print((char)(i+65));
				loopJ(i, j+1);
			}
	}

}
