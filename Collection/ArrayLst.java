import java.util.*;
class ArrayLst
{
  public static void main(String... args)
  {
     ArrayList al=new ArrayList();
	 al.add(10);
	 al.add(0,20);
	 al.add(70l);
	 al.add(30f);
	 al.add(40d);
	 al.add('A');
	 al.add("Rohan");
	 al.add(true);
	 al.add(50);
	 al.add(100);
	 al.add(110);
	System.out.println("=============Iteration using for loop==============");
	for(int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i));
	}
	System.out.println("=============Iteration using for-each loop==============");
	for(Object obj:al)
	{
		System.out.println(obj);
	}
	System.out.println("=============Iteration using Iterator cursor loop==============");
	Iterator it=al.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("=============List-Iteration using Iterator cursor loop==============");
	ListIterator li=al.listIterator();
	while(li.hasNext())
	{
		System.out.println(li.next());
	}
	System.out.println("=============Reverse List-Iteration using Iterator cursor loop==============");
	while(li.hasPrevious())
	{
		System.out.println(li.previous());
	}
	 
  }
}