class A
{
	public void set(int id)
	{
	System.out.println("Class A");
	}

}

	class Boss extends A
	{
	public void set(int id,String name)
	{
	System.out.println("Class B");
	}
	}
	public class NewEmp
	{
	public static void main(String[]args)
	{
	Boss b1 = new Boss();
	b1.set(101,"nitin");
	b1.set(101);
	}
}