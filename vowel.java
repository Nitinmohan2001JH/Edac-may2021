import java.util.*;
public class vowel
{
	public static void main(String args[])
	{
		char ch='p';
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
		char ch=sc.next().CharAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		System.out.println("ch+ is a vowel");
		else
		System.out.println("ch+ is a consonant");
	}	
}