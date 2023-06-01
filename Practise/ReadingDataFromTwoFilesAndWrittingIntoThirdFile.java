import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
class ReadingDataFromTwoFilesAndWrittingIntoThirdFile
{
   public static void main(String... args)throws IOException
   {
      FileReader firstFile=new FileReader("One.txt");
	  FileReader secondFile=new FileReader("Two.txt");
	  BufferedReader brOne=new BufferedReader(firstFile);
	  BufferedReader brTwo=new BufferedReader(secondFile);
	  FileWriter fw=new FileWriter("Third.txt");
	  BufferedWriter bwOne=new BufferedWriter(fw);
	  BufferedWriter bwTwo=new BufferedWriter(fw);
	  String value=brOne.readLine();
	  while(value!=null)
	  {
	     bwOne.write(value+"\n");
		 value=brOne.readLine();
	  }
	  value=brTwo.readLine();
	  while(value!=null)
	  {
	     bwTwo.write(value);
		 value=brTwo.readLine();
	  }
	  bwOne.flush();
	  bwTwo.flush();
	  bwOne.close();
	  bwTwo.close();
	  brOne.close();
	  brTwo.close();
	  firstFile.close();
	  secondFile.close();
	  
	  
   }
}