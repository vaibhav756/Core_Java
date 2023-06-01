import java.io.File;
import java.io.IOException;
import java.util.*;
class FileHandling
{
  public static void main(String... args)throws IOException
  {
      File f1=new File("C:"+File.separator+"Java"+File.separator+"Core Java"+File.separator+"FileHandlingNewCreatedFileTest.txt");
	  f1.createNewFile();
	  File f2=new File("Demo");
	  f2.mkdir(); 
	  System.out.println(f2.exists());
	  File f3=new File("Demo1");
	  f3.mkdir();
	  File f4=new File(f3,"InsiderFile.txt");
	  f4.createNewFile();
/*	  File f5=new File("C:"+File.separator+"Java"+File.separator+"Core Java");
	  System.out.println(Arrays.toString(f5.list()));*/
	  File f5=new File("C:"+File.separator+"Java"+File.separator+"Core Java"+File.separator+"Demo1"+File.separator+"Demo");
	  f5.mkdir();
	  //System.out.println(Arrays.toString(f5.list()));
	  /*File f6=new File("Demo1");
	  String files[]=f6.list();
	  for(String file:files)
	  {
		 if(new File(file).isDirectory())
         System.out.println("Directory: "+file);
         else if(new File(file).isFile())	 
	     System.out.println("File: "+file);
	     else
	     System.out.println("Unknown");
	  }*/
	  File f=new File("Demo1");   //Always use \\ for file directory
	  String flist[]=f.list();
	  for(String fname:flist)
	  {
		  File fx=new File(fname);
		  if(fx.isDirectory())
		  System.out.println("Directory: "+fx);
          else if(fx.isFile())
		  System.out.println("File: "+fx);			  
	  }
	  File f6=new File("FileForDelete.txt");
	  f6.createNewFile();
	  File f7=new File("FileForDelete.txt");
	  f7.delete();
  }
}