import java.util.concurrent.*;
public class Anonymous
{
	public static void main(String... args)
	{
		Thread t=new Thread(){
			public void run()
			{
				System.out.println("Run method executed by thread class...");
			}
		};
		t.start();
		Runnable r=new Runnable(){
			public void  run()
			{
				System.out.println("Run method executed by Runnable Interface...");
			}
		};
		Thread t1=new Thread(r);
		t1.start();
		Callable c=new Callable(){
			public Object call()
			{
				System.out.println("Run method executed by Callable Interface...");
				return "Hi...";
			}
		};
		ExecutorService es=Executors.newFixedThreadPool(10);
		es.submit(c);
		
	}
}