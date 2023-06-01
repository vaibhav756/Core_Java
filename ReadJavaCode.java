import java.io.*;
class ReadJavaCode
{
  public static void main(String... args) throws IOException
  {
     BufferedReader br=new BufferedReader(new FileReader("RoleFinder.java"));
		String line="";
		 while ((line = br.readLine()) != null) {
                System.out.println(line);
            }	
  }
}