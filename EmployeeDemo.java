class Employee
{
	int Id;
	String name;
	String location;
	void set(int i, String n,String l)
	{
	Id =i;
	name=n;
	location=l;
	}
	void display()
	{
	System.out.println(Id+" "+name+" "+location);
	}
}
	class EmployeeDemo
	{
	public static void main(String[]args)
	{
	Employee e1 = new Employee();
	e1.set(123,"Nitin","calicut");
	e1.display();
	}
}