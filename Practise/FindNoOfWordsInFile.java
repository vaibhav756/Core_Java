import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class FindNoOfWordsInFile
{
	public static void main(String... args)throws IOException
	{
		FileWriter fw=new FileWriter("TextFile.txt");
		fw.write("Hello There...");
		fw.write("How Are You?");
		fw.flush();
		fw.close();
		FileReader fr=new FileReader("TextFile.txt");
		int charIntval=fr.read();
		int count=1;
		while(charIntval!=-1)
		{
			char value=(char)charIntval;
			System.out.println(value+"Total words: "+count);
			if((value==' ') || (value=='\n'))
			{
				count++;
			}
			charIntval=fr.read();
		}
		System.out.println("Total words: "+count);
	}
}