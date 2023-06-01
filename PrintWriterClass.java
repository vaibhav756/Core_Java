import java.io.PrintWriter;
import java.io.IOException;
class PrintWriterClass
{
   public static void main(String... args)throws IOException
   {
      /*PrintWriter pw=new PrintWriter(System.out);
	  pw.print("Hello World...");
	  pw.println("NextLine\nNextLine");
	  pw.flush();
	  pw.close();*/
	  
	  PrintWriter pw=new PrintWriter("WritingDataUsingPrintWriter.txt");
	  pw.write("Hello, PrintWriter Here...");
	  pw.flush();
	  pw.close();
   }
}