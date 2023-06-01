import java.io.*;
import java.util.*;
public class StringTokenizerClass
{
   public static void main(String... args)throws Exception
   {
      //String name="Vaibhv Kamlakar Yadav";
	  Scanner sc=new Scanner(new File("AnagramsString.java"));
	  int i=0;
	  while(sc.hasNext())
	  {
		  String val=sc.nextLine();
	      StringTokenizer st=new StringTokenizer(val,"");
		  while(st.hasMoreTokens())
		  {
             System.out.println(st.nextToken());
		  }
	  }
   }
}