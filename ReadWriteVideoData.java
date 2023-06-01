import java.io.*;
class ReadWriteVideoData
{
   public static void main(String... args)throws Exception
   {
       FileInputStream fis=new FileInputStream("Dummy.mp4");
	   int fileSize=fis.available();
	   byte videoArr[]=new byte[fileSize];
	   fis.read(videoArr);
	   
	   FileOutputStream fos=new FileOutputStream("Vaibhav.mp4");
	   fos.write(videoArr);
	   
   }
}