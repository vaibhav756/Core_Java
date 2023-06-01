public class GenericClass<T>
{
    
   public void m1(T obj)
   {
       System.out.println("Entered Data : "+obj+" with Datatype : "+obj.getClass().getName());
   }

   public static void main(String... args)
   {
       GenericClass gc=new GenericClass();
	   gc.m1(10);
	   gc.m1(10.456f);
	   gc.m1('A');
	   gc.m1("Vaibhav");
	   gc.m1(true);
	   
   }
}