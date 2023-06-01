import java.util.*;
public class DateDemo
{
   public static void main(String... args)
   {
      Date now=new Date();
	  Date d=new Date(1996,10,30);
	  /*System.out.println(d.before(now));
	  System.out.println(d.after(now));*/
	  System.out.println(d+" --- "+now);
	  System.out.println(d.before(now));
	  
   }
}