class ArrayObj
{
public static void main(String[]args)
{
 Employee[] arr;
 arr = new Employee[3];
 arr[0] = new Employee(1, "nitin");
 arr[1] = new Employee(2, "mohan);
 System.out.println("Employee Data 0");
 arr[0].display();
 System.out.println("Employee data 1");
 arr[1].display();
 }
}
