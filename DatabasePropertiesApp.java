import java.io.*;
import java.util.*;
public class DatabasePropertiesApp
{
  public static void main(String... args)throws Exception
  {
      FileInputStream fis=new FileInputStream("Data.txt");
	  Properties p=new Properties();
	  p.load(fis);
	  
	  String uname=p.getProperty("userName");
	  String upwd=p.getProperty("userPwd");
	  
	  System.out.println(uname+" --- "+upwd);
  }
}