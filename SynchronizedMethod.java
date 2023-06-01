public class SynchronizedMethod implements Runnable
{
  public synchronized void printNumbers()
  {
	 try{
		 
     for(int i=1;i<=10;i++)
	 {
		 System.out.println(Thread.currentThread().getName()+" => "+i);
		 Thread.sleep(1000);
	 }	
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }		 
  }

  public void run()
  {
	  printNumbers();
  }
	
  public static void main(String... args)
  {
     SynchronizedMethod sc=new SynchronizedMethod();
	 Thread t=new Thread(sc);
	 t.start();
	 
	 Thread t1=new Thread(sc);
	 t1.start();
	 
  }
}