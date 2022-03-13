package Array;

public class shubham {
	
	public static void main(String[] args) {
		
		int pp=5,qq=7,rr=4;
		for(int i=4;i<5;i++)
		{
			if((9+qq-pp)<(pp+rr))
				continue;
			qq=(qq&12)+pp;
			pp=7+pp;
		}
		System.out.println(pp+qq);
	}

}
