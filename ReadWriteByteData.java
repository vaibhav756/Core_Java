import java.io.*;
class ReadWriteByteData
{
   public static void main(String... args)throws Exception
   {
	   //======================Serialization===============================//
	  Person p=new Person();
	  p.id=100;
	  p.name="Vaibhav Yadav";
	  FileOutputStream fos=new FileOutputStream("Person.txt");
	  ObjectOutputStream oos=new ObjectOutputStream(fos);
	  oos.writeObject(p);
	  oos.flush();
	  oos.close();
	  //========================Deserialization=============================//
	  FileInputStream fis=new FileInputStream("Person.ser");
	  ObjectInputStream ois=new ObjectInputStream(fis);
	  Person p1=(Person)ois.readObject();
	  System.out.println(p1.id+" "+p1.name);
	  
	  
   }
}
class Person implements Serializable
{
	int id;
	String name;
}