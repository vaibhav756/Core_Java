import java.lang.reflect.*;
public class AccessingPrivateVariableUsingReflectionApi
{
   public static void main(String... args)throws Exception
   {
	  try
	  {
		  
	  Class clz=Class.forName("Employee");
      Field field=clz.getDeclaredField("empId");
	  field.setAccessible(true);
	  Object obj=clz.newInstance();
	  field.set(obj,35);
	  Employee emp=(Employee)obj;
	  System.out.println("Employee Id : "+emp.getEmpId());
	  
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
   }
}
