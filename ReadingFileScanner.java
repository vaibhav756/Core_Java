import java.io.*;
import java.util.*;
public class ReadingFileScanner
{
  public static void main(String... args)throws Exception
  {
     Scanner sc=new Scanner(new File("abc.txt"));
	 while(sc.hasNext())
	 {
        System.out.println(sc.nextLine());
	 }
	 sc.close();
  }
}