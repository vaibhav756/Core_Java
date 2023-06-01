class Student
{
    int id;
    String name;
    
	protected Student()
	{
		System.out.println("Constructor executed...");
	}
	
	private Student(int id,String name)
	{
        this.id=id;
		this.name=name;
	}
	
	public static void main(String... args)
	{
		Student s1=new Student(101,"Vaibhav");
		Student s2=new Student(102,"Rohan");
		s1.m2();
		System.out.println(s1.id+" "+s1.name);
/*	  Student s1=new Student(101,"Vaibhav");
	  s1.id=101;
	  s1.name="Vaibhav";
	  s1.age=25;
	  s1.gender="Male";
	  
	  Student s2=new Student(102,"Rohan");
	  s2.id=102;
	  s2.name="Rohan";
	  s2.age=35;
	  s2.gender="Male";*/
	  Student s3=new Student();
	  
	  
	  
	}
	
	private void m1()
	{
		System.out.println("M1 is called...");
	}
	private void m2()
	{
		m1();
	}
}