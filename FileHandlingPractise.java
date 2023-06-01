import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
class FileHandlingPractise
{
  public static void main(String... args)throws IOException
  {
/*    FileWriter fw=new FileWriter("abc.txt");
	fw.write("Hello World");
	fw.write("\n");
	fw.write("How are you?");
	fw.flush();
	fw.close();*/
	
	FileReader fr=new FileReader("abc.txt");
	int val=fr.read();
	FileWriter fw=new FileWriter("xyz.txt");
	while(val!=-1)
	{
		fw.write((char)val);
		fw.flush();
	   //System.out.print((char)val);
       val=fr.read();	   
	}
	fw.close();
	fr.close();

  }
}