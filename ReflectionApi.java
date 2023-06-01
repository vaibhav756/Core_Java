import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
public class ReflectionApi
{
   public static void main(String... args)throws Exception
   {
	   Class clz=Class.forName("Student");
	   Field[] fields=clz.getDeclaredFields();
	   for(Field f:fields)
	   {
		 System.out.println(f.getName());   
	   }
	   System.out.println("====================================");
	   Method[] method=clz.getDeclaredMethods();
       for(Method m:method)
	   {
		   System.out.println(m.getName());
	   }		   
	   System.out.println("====================================");
	   Constructor[] con=clz.getDeclaredConstructors();
	   for(Constructor c:con)
	   {
		   System.out.println(c);
	   }
	   
   }
}