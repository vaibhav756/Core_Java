import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
class FindNoOfLinesInFile
{
	public static void main(String... args)throws IOException
	{
		FileReader fr=new FileReader("TextFIle.txt");
		BufferedReader br=new BufferedReader(fr);
		int count=0;
		String val=br.readLine();
		while(val!=null)
		{
			if((!val.isEmpty()))
			{
				count++;
				System.out.println(val);
			}
			val=br.readLine();
		}
		
		System.out.println("No of lines: "+count);
		
	}
}