import java.util.*;
public class EmpSalaryComparator implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		return (int)(e1.empSalary - e2.empSalary);
	}
}