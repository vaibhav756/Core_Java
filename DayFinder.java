import java.io.*;
class DayFinder
{
   public static void main(String... args)throws IOException
   {
      InputStreamReader isr=new InputStreamReader(System.in);
	  BufferedReader br=new BufferedReader(isr);
	  System.out.println("Enter number");
	  String day=br.readLine();
	  switch(day)
	  {
		case "1": System.out.println("Monday");
                break;
		case "2": System.out.println("Tuesday");
                break;
		case "3": System.out.println("Wednesday");
                break;
		case "4": System.out.println("Thursday");
                break;
		case "5": System.out.println("Friday");
                break;
		case "6": System.out.println("Saturday");
                break;
		case "7": System.out.println("Sunday");
                break;
        default : System.out.println("No day found");
                break;
		
	  }
	  //Switch case except boolean,String and Number only
   }
}