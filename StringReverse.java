class StringReverse
{
   public static void main(String... args)
   {
      String Designation="Java Developer";
	  StringBuffer sb=new StringBuffer();
	  for(int i=Designation.length()-1;i>=0;i--)
	  {
//		  System.out.print(Designation.charAt(i));
		  sb.append(Designation.charAt(i));
	  }
	  System.out.print(sb);
   }
}