package Math.pow;

public class math 
{
	static double pow(int num,int n)
	{
		double finalresult=1;
		 for(int i=1;i<=n;i++)
		 {
			 finalresult=finalresult*num;
		 }
		return finalresult;
	}
	
}
