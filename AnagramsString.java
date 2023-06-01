class AnagramsString
{
   public static void main(String... args)
   {
      String first="keep";     //(keep and peek)(race and care) are anagram strings
	  String second="peek";
	  //Check length of both the strings first
	  if(!(first.length()==second.length()))
	  {
	  System.out.println(first+" and "+second+" is not Anagram String");
      return;		  
	  }
	  boolean result=true;
	  for(int i=0;i<first.length();i++)
	  {
		  if(!second.contains(String.valueOf(first.charAt(i))))
		  {
			  result=false;
			  break;
		  }	  
	  }
	  if(result)
	  System.out.println(first+" and "+second+" is Anagram String");
      else
	  System.out.println(first+" and "+second+" is not Anagram String");		  
   }
}