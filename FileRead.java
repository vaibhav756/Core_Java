import java.io.File;
import java.io.IOException;
class FileRead
{
  public static void main(String... args)throws IOException
  {
    File f=new File("CreatedFile.txt");
	f.createNewFile();
	File f2=new File("Test");
	f2.mkdir();
	File f1=new File(f2,"createdFile.txt");
	f1.createNewFile();
	File f3=new File("C:\\Java\\Core Java\\Test\\Folder");
	f3.mkdir();
	File f4=new File("C:\\Java\\Core Java\\Test");
	String list[]=f4.list();
	for(String file:list)
	{
		File f5=new File("C:\\Java\\Core Java\\Test\\"+file);
		if(f5.isDirectory())
		System.out.println("Directory: "+file);
        else if(f5.isFile())
        System.out.println("File: "+file);			
	}
	
  }
}