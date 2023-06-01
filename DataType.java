public class DataType
{
  byte age;
  short salary;
  int enginenumber;
  long mobile;
  float newSalary;
  double serialNumber;
  char gender;
  boolean condition;
  public static void main(String... args)
  {
	  DataType dt=new DataType();
	  dt.newSalary=10.0014578f;
	  dt.serialNumber=10.1154445456546546546465465465;
	  System.out.println("Byte Default value: "+dt.age);
	  System.out.println("Short Default value: "+dt.salary);
	  System.out.println("Integer Default value: "+dt.enginenumber);
	  System.out.println("Long Default value: "+dt.mobile);
	  System.out.println("Float Default value: "+dt.newSalary);
	  System.out.println("Double Default valnue: "+dt.serialNumber);
	  System.out.println("Character Default value: "+dt.gender);
	  System.out.println("Boolean Default value: "+dt.condition);
	  System.out.println("Unicode value: "+"\u2178");
	  
  }
}