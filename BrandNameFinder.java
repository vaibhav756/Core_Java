import java.io.*;
class BrandNameFinder
{
   public static void main(String... args)throws IOException
   {
       InputStreamReader isr=new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(isr);
	   System.out.println("Enter Brand Name");
	   String brand=br.readLine();
	   switch(brand)
	   {
		   case "Nike":System.out.println("Just Do it.");
		           break;
		   case "Adidas":System.out.println("Imposible is nothing");
		           break;
		   case "Puma":System.out.println("Forever faster");
		           break;
		   case "Reebok":System.out.println("I am what i am.");
		           break;
		   default : System.out.println("Brand Not Found");
	   }
   }
}