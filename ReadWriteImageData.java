import java.io.*;
class ReadWriteImageData
{
  public static void main(String... args)throws Exception
  {
     FileInputStream fis=new FileInputStream("car.jpg");
	 int size=fis.available();
	 byte b[]=new byte[size];
	 fis.read(b);
	 
	 FileOutputStream fos=new FileOutputStream("newCar.jpg");
	 fos.write(b);
  }
}