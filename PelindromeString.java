class PelindromeString
{
   public static void main(String... args)
   {
//      String name="liril";   Pelindrome String
      String name="Vaibhav";
	  StringBuffer sb=new StringBuffer();
	  for(int i=name.length()-1;i>=0;i--)
	  {
		  sb.append(name.charAt(i));
	  }
	  if(name.equals(sb.toString()))
	  System.out.println(name+" is pelindrome string");
      else
	  System.out.println(name+" is not pelindrome string");
   }
}