import java.io.FileReader;
import java.io.IOException;
class ReadCharacterInFile
{
  public static void main(String... args)throws IOException
  {
     FileReader f=new FileReader("C:\\Java\\Core Java\\Practise\\ReadCharacterInFile.txt");
	 int charAsciiVal=f.read();
	 int count=1;
	 while(charAsciiVal!=-1)
	 {
		 char val=(char)charAsciiVal;
		 if((val!=' ') && (val!='\n'))
		 {	
			System.out.println(charAsciiVal+"c "+val+" "+count);
			count++;		
		 }
         charAsciiVal=f.read();		 
	 }
	 System.out.println("\nCount value:"+count);
	 f.close();

  }
}