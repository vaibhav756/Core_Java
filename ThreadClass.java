import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
class ThreadClass implements Callable
{
	public Object call()
	{
		System.out.println("Call method called... by : "+Thread.currentThread().getName());
		return "Hiii...";
	}
	
	public static void main(String... args)
	{
		System.out.println("Main method started... by : "+Thread.currentThread().getName());
		ThreadClass tc=new ThreadClass();

		ExecutorService es=Executors.newFixedThreadPool(10);
		for(int i=0;i<15;i++)
		{
			es.submit(tc);
		}
		System.out.println("Main method ended... by : "+Thread.currentThread().getName());
		es.shutdown();
		
	}
}