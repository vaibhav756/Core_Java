import java.util.*;
import java.util.Map.Entry;
public class HashMapDemo
{
	public static void main(String... args)
	{
       HashMap<Integer,String> map=new HashMap<>();
	   map.put(101,"Rohan");
	   map.put(102,"Ketan");
	   map.put(103,"Vikram");
	   map.put(104,"Pranay");
	   map.put(105,"Prathmesh");
	   map.put(106,"Mohit");
	   map.put(107,"Aditya");

       //System.out.println();
	   System.out.println(map.get(104));
	   System.out.println(map.remove(102));
	   System.out.println(map);
	   System.out.println(map.size());
	   System.out.println(map.containsKey(105));
	   System.out.println(map.containsValue("Aditya"));
	   Set<Integer> keys=map.keySet();
	   for(Integer key:keys)
	   {
		   System.out.println(key);
	   }
	   
	   Collection<String> value=map.values();
	   for(String val:value)
	   {
		   System.out.println(val);
	   }
	   
	   Set<Entry<Integer,String>> entry=map.entrySet();
	   for(Entry ent:entry)
	   {
		   System.out.println(ent.getKey()+" --- "+ent.getValue());
	   }
	   
	   System.out.println(map.isEmpty());
	   
	   
	}
}