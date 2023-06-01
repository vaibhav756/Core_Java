import java.io.*;
class FindingCommonWordsInFile
{
   public static void main(String... args)throws Exception
   {
	   FileReader frOne=new FileReader("One.txt");
	   int val=frOne.read();
	   StringBuffer sb=new StringBuffer();
	   while(val!=-1)
	   {
		   char value=(char)val;
		   if(value!=' ' && value!='\n')
		   {
			   sb.append(value);
		   }
		   else
		   {
			   FileReader frTwo=new FileReader("Two.txt");
			   BufferedReader br=new BufferedReader(frTwo);
			   String string=br.readLine();
			   while(string!=null)
			   {
				   if(string.indexOf(sb.toString())!=-1)
				   {
					   System.out.println("Common word: "+sb);
				   }				   
				   string=br.readLine();
			   }
			   sb=new StringBuffer("");

		   }
		   val=frOne.read();
	   }
	   
   }
}