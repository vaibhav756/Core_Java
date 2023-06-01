class CommandLineArguement
{
   public static void main(String... x)
   {
      int num1=Integer.parseInt(x[0]);
	  int num2=Integer.parseInt(x[1]);
	  System.out.println("Array Length "+x.length);
	  System.out.println("Addition of two number is "+(num1+num2));
	  
   }
}