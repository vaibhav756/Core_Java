public class DeadLock implements Runnable
{
	public synchronized static void m2()
	{
		m1();
	}
	
	public synchronized static void m1()
	{
		m2();
	}
	
	public void run()
	{
		m1();
	}
	
	public static void main(String... args)
	{
		Thread d1=new Thread(){
			
			public void run()
			{
				m1();
			}
		};
		d1.start();
		
		Thread d2=new Thread(){
			
			public void run()
			{
				m2();
			}
		};
        d2.start();	
		
	}
}