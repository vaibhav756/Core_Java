import java.util.*;
public class CollectionsSort
{
   public static void main(String... args)
   {
       ArrayList al=new ArrayList();
	   al.add(12);
	   al.add(65);
	   al.add(4);
	   al.add(78);
	   al.add(13);
	   al.add(35);
	   al.add(44);
	   
	   System.out.println(al);
	   
	   Collections.sort(al);
	   
	   System.out.println(al);
	   
	   Collections.reverse(al);
	   
	   System.out.println(al);
	   
   }
}