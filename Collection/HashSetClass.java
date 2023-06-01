import java.util.*;
public class HashSetClass
{
   public static void main(String... args)
   {
      HashSet<String> hs=new HashSet<>();
	  hs.add("One");
	  hs.add("Two");
	  hs.add("Three");
	  hs.add("One");
	  hs.add(null);
	  System.out.println(hs);
	  Iterator it=hs.iterator();
	  while(it.hasNext())
	  {
		System.out.println(it.next());  
	  }
	  
	  HashSet<Student> hs1=new HashSet<>();
	  hs1.add(new Student(101,"Ram"));
	  hs1.add(new Student(102,"Sham"));
	  hs1.add(new Student(103,"Ketan"));
	  hs1.add(new Student(104,"Rohan"));
	  
	  Iterator it1=hs1.iterator();
	  while(it1.hasNext())
	  {
		  System.out.println(it1.next());
	  }
	  
   }
}
class Student
{
	int id;
	String name;
	
	public Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return id+" - "+name;
	}
}
