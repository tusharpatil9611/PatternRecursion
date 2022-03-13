package PatternRecursive;

public class Q1Bk {

	public static void main(String[] args)
	{
		loopI(0);	
	}
	private static void loopJ(int j) 
	{
		if(j <=4)
		{
			System.out.print("*");
		loopJ(j+1);
		}
	}
	private static void loopI(int i) 
	{
		if(i <=4)
		{
			loopJ(0);
			System.out.println();
		loopI(i+1);
		}
	}
	
	
}
