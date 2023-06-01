import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.*;
class RoleFinderDemo{
    public static void main(String... args)throws Exception
	{
	    BufferedReader br=new BufferedReader(new FileReader("RoleFinder.java"));
		String line="";
		while((line=br.readLine())!=null)
		{
		   System.out.println(br.readLine());	
		}	
    }
}