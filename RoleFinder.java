import java.io.*;
class RoleFinder
{
  public static void main(String... args) throws IOException
  {
      int value;
	  InputStreamReader isr=new InputStreamReader(System.in);
	  BufferedReader bf=new BufferedReader(isr);
	  System.out.println("Enter year of experience: ");
	  String val=bf.readLine();     //ReadLine method read whole line whereas read() method read only single character(ASCII) value.
	  value=Integer.parseInt(val);
	  if(value>=0 && value<=2)
	  {
		  System.out.println("Associate Engineer");
	  }
	  else if(value>=3 && value<=5)
	  {
		  System.out.println("Software Engineer");
	  }
	  else if(value>=6 && value<=10)
	  {
		  System.out.println("Sr.Software Engineer");
	  }		
      else if(value>=10 && value<=15)
	  {
		  System.out.println("Manager");
	  }		
      else
	  {
		  System.out.println("Role not found");
	  }		  
	
  }
}