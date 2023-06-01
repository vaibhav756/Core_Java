import java.util.concurrent.*;
public class AnonymousThreadCreation
{
   public static void main(String... args)
   {
	   //Anonymous thread creation using Thread class.
	   Thread t=new Thread(){
		   public void run()
		   {
			   System.out.println("Thread object run method running by : "+Thread.currentThread().getName());
		   }
	   };
	   t.start();
	   
	   //Anonymous thread creation using Runnable Interface.
	   Runnable r=new Runnable(){
		   
		   public void run()
		   {
			 System.out.println("Runnable interface run method running by : "+Thread.currentThread().getName());   
		   }
	   };
	   Thread t1=new Thread(r);
	   t1.start();
	   
	   //Anonymous thread creation using Callable Interface.
	   Callable call=new Callable(){
		   public Object call()
		   {
			   System.out.println("Callable interface call method running by : "+Thread.currentThread().getName());
			   return "Hi...";
		   }
	   };
	   ExecutorService es=Executors.newFixedThreadPool(1);
	   es.submit(call);
	   es.shutdown();
	   
	   
   }
}