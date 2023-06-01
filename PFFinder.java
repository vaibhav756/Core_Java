import java.io.*;
class PFFinder
{
  public static void main(String... args)throws IOException
  {
     InputStreamReader isr=new InputStreamReader(System.in);
     BufferedReader br=new BufferedReader(isr);
	 int salary=Integer.parseInt(br.readLine());
	 int pf=(12*salary)/100;
	 System.out.println(pf);
  }
}