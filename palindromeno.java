public class palindromeno
{
	public static void main(String args[])
	{
	int r; 
	int Sum=0;
	int n=5225;
	int temp=n;
	while(n>0)
	{
		r=n%10;
		Sum=Sum*10=r;
		n=n/10;
	}
		if(temp==sum)
		{
		System.out.println("Palindrome");
		}
		else
		System.out.println("Not a Palindrome");
		
	}
}