import java.util.*;
public class TreeSetClass
{
  public static void main(String... args)
  {
      TreeSet ts=new TreeSet();
	  ts.add(12);
	  ts.add(65);
	  ts.add(45);
	  ts.add(1);
	  ts.add(12);
//    ts.add(null);	Null values are not allowed as it compares the object 
//    ts.add("Rohan"); Can't hold Heterogeneous data as it perform sorting operation
	  System.out.println(ts);
	  Iterator it=ts.iterator();
	  while(it.hasNext())
	  {
		System.out.println(it.next());  
	  }
  }
}