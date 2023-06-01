import java.util.concurrent.*;
public class ThreadTest implements Callable
{
   public Object call()
   {
	 System.out.println("Call method called...");
	 synchronized(this)
		{	 
			 for(int i=0;i<10;i++)
			 {
				 System.out.println(Thread.currentThread().getName()+" === "+i);
			 }
	    }
     return "Hi...";	 
   }
   public static void main(String... args)
   {
	    ThreadTest t=new ThreadTest();
		ExecutorService es=Executors.newFixedThreadPool(10);
		for(int i=0;i<10;i++)
		{
           es.submit(t);
		}
		es.shutdown();
   }
}