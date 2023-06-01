public class Employee implements Comparable<Employee>
{
    int empId;
	String empName;
	double empSalary;
	
	public Employee(int empId,String empName,double empSalary)
	{
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	
	public String toString()
	{
	   return "Employee ["+empId+"  --  "+empName+"  --  "+empSalary+"]";	
    }
	
	public int compareTo(Employee e)
	{
      return (int)(this.empSalary - e.empSalary);		   
	}
}