import java.io.*;
class ReadingHtmlFileAndAddingImage
{
	public static void main(String... args)throws Exception
	{
		FileInputStream fis=new FileInputStream("htmlFile.html");
		int size=fis.available();
		byte htmlByte[]=new byte[size];
		fis.read(htmlByte);
		String htmlContent=new String(htmlByte);
		String htmlContent1=htmlContent.replace("carImage","C:\\Java\\Core Java\\car.jpg");
		System.out.println(htmlContent1);
        FileOutputStream fos=new FileOutputStream("NewHtmlFile.html");
		fos.write(htmlContent1.getBytes());
		
		
	}
}