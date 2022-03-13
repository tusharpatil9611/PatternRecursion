package PatternRecursive;

public class Q27 {

	public static void main(String[] args) 
	{
		loopI(0);
	}
	private static void loopI(int i) 
	{
		if(i<=8)
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
			if(j-i<=0 && j+i<=8)
			{
				if(i<=4)
					System.out.print((char)(i+65));
				else
					System.out.print((char)(65+8 -i));
			}
				
			loopJ(i, j+1);
		}
	}

}
