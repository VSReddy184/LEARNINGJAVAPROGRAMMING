package ArmstrongNumber;

public class armstrongChecker 
{
 public static void isArmstrong(int n)
 {
	 int original=n;
	 int sum=0;
	 while(n>0)
	 {
		 int ld=n%10;
		 sum=sum+ld*ld*ld;
		 n=n/10;
	 }
	 if(original==sum)
	 {
		 System.out.println("The number is Armstrong number");
	 }
	 else
	 {
		 System.out.println("The number is not Armstrong number");
	 }
 }
}
