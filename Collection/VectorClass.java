import java.util.*;
public class VectorClass
{
  public static void main(String... args)
  {
     Vector v=new Vector();
	 v.add(10);
	 v.add(20);
	 v.add(30);
	 v.add(40);
	 v.add(50);
	 v.add(10);
	 v.add(null);
     Enumeration em=v.elements();
	 while(em.hasMoreElements())
	 {
		System.out.println(em.nextElement()); 
	 }
  }
}