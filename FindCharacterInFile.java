import java.io.FileReader;
import java.io.IOException;
class FindCharacterInFile
{
  public static void main(String... args)throws IOException
  {
      FileReader fr=new FileReader("C:\\Java\\Core Java\\Demo\\insiderFile.txt");
	  int val=fr.read();
	  int count=0;
	  while(val!=-1)
	  {
		  if((char)val!=' ')
		  {
          System.out.print((char)val);			  
		  count++;
		  val=fr.read();
		  }		  
	  }
	  fr.close();
	  System.out.println("Number of character: "+count);
  }
}