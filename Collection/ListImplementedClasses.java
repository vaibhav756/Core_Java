import java.util.*;
public class ListImplementedClasses
{
    public static void main(String... args)
	{
		System.out.println("============ArrayList Class=============");
		List<Integer> l=new ArrayList<Integer>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("============LinkedList Class=============");
		
		List<String> li=new LinkedList<>();
		li.add("Vaibhav");
		li.add("Rohan");
		li.add("Ketan");
        ListIterator listIterator=li.listIterator();
        while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}			

		
		System.out.println("============Vector Class=============");
		Vector v=new Vector();
		v.add('A');
		v.add('B');
		v.add('C');
		v.add('D');
		v.add('E');
        Enumeration em=v.elements();
		while(em.hasMoreElements())
		{
			System.out.println(em.nextElement());
		}
		
		System.out.println("============Stack Class=============");
	    Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
	
	}
}