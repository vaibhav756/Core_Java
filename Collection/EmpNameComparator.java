import java.util.*;
public class EmpNameComparator implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		return e1.empName.compareTo(e2.empName);
	}
}