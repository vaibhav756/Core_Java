import java.util.*;
public class CustomSorting
{
   public static void main(String... args)
   {
	   ArrayList<Employee> al=new ArrayList<>();
	   al.add(new Employee(500,"Rohan",45625.012));
	   al.add(new Employee(120,"Ketan",78542.012));
	   al.add(new Employee(780,"Amit",78945.2145));
	   al.add(new Employee(35,"Piyush",7825456.1245));
	   al.add(new Employee(498,"Rupesh",45789.3254));
	   
	   //Collections.sort(al,new EmpIdComparator());
	   //Collections.sort(al,new EmpNameComparator());
	   Collections.sort(al,new EmpSalaryComparator());
	   for(Employee e:al)
	   {
		   System.out.println(e);
	   }
	   
	   Collections.sort(al,new Comparable<Employee>(){
		   return
	   })
	   
   }
}