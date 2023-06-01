import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
class FileReadingAndWritting
{
  public static void main(String... args)throws IOException
  {
	 File f=new File("Demo"); 
	 f.mkdir();
	 File f1=new File(f,"insiderFile.txt");
	 f1.createNewFile();
     FileWriter fw=new FileWriter("C:\\Java\\Core Java\\Demo\\insiderFile.txt");
	 fw.write("Hello World");
	 fw.write("\n");
	 fw.write("How are you?");
	 fw.write("\n");
	 fw.write("How's everything going?");
	 fw.flush();       //Forcing data forcefully in the file
	 fw.close();
	 FileReader fr=new FileReader("C:\\Java\\Core Java\\Demo\\insiderFile.txt");
	 FileWriter fw1=new FileWriter("C:\\Java\\Core Java\\Demo\\insiderTextFile.txt");
	 int val=fr.read();
	 while(val!=-1)
	 {
		 System.out.print((char)val);
		 fw1.write((char)val);
		 val=fr.read();
	 }
	 fw1.flush();
	 fw1.close();
	 fr.close();
	 //Alternate and faster option in file read and write operation is BufferedReader and BufferedWritter
	 FileReader fr1=new FileReader("C:\\Java\\Core Java\\Demo\\insiderFile.txt");
	 BufferedReader br=new BufferedReader(fr1);
	 String stringVal=br.readLine();
	 FileWriter fw2=new FileWriter("C:\\Java\\Core Java\\Demo\\xyz.txt");
	 BufferedWriter bw=new BufferedWriter(fw2);
	 while(stringVal!=null)
	 {
		System.out.println(stringVal);
		bw.write(stringVal+"\n");
        stringVal=br.readLine();		
	 }
	 bw.flush();
	 bw.close();
	 
	 File f5=new File("Practise");
	 f5.mkdir();
	 File f6=new File(f5,"ReadCharacterInFile.java");
	 f6.createNewFile();
	 File f7=new File(f5,"FindNoOfWordsInFile.java");
	 f7.createNewFile();
	 File f8=new File(f5,"FindNoOfLinesInFile.java");
	 f8.createNewFile();

  }
}