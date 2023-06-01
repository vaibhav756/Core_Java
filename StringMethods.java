import java.util.*;
import java.util.Locale;
class StringMethods
{
  public static void main(String... args)
  {
	  String name="Vaibhav Yadav";
	  System.out.println(name.charAt(0));
	  System.out.println(name.length());
	  System.out.println(name.equals("Vaibhav Yadav"));
	  System.out.println(name.replace("Vaibhav","Kiran"));
	  System.out.println(name.indexOf("v"));
	  System.out.println(name.lastIndexOf("v"));
	  System.out.println(name.substring(0,7));
	  System.out.println(Arrays.toString(name.split(" ")));
	  System.out.println(name.concat(" Kamlakar"));
	  System.out.println(name.toUpperCase());
	  System.out.println(name.toLowerCase());
	  Integer age=null;
	  String age1=String.valueOf(age);
	  System.out.println(age1);
	  //String age2=age.toString();   //Throws null pointer exception
	  System.out.println(name.compareTo("Vaibhav Xadav"));
	  System.out.println(name.concat("is my name"));
	  System.out.println(name.contains("Vaibhav"));
	  System.out.println(name.startsWith("V"));
	  System.out.println(name.endsWith("v"));
//	  System.out.println(Locale.getDefault(mr));
	  System.out.println(name.hashCode());
	  System.out.println("".isEmpty());
	  System.out.println("vaibhav".matches("[a-z]"));
	  System.out.println(name.subSequence(0,7));
	  System.out.println(name.substring(8));
	  System.out.println(Arrays.toString(name.toCharArray()));
	  System.out.println(String.valueOf(10.00));
	  
	  
  }
}

