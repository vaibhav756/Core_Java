import java.util.*;
public class EmpIdComparator implements Comparator<Employee>
{
   public int compare(Employee e1,Employee e2)
   {
      return e1.empId - e2.empId;
   }
}