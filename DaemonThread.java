class DaemonThread implements Runnable
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		System.out.println("Run method started... by : "+Thread.currentThread().getName());
	}
    public static void main(String... vaibhav)
	{
		System.out.println("Main method started... by : "+Thread.currentThread().getName());
		DaemonThread dt=new DaemonThread();
		Thread t=new Thread(dt);
//		t.setDaemon(true);
		t.start();
		System.out.println("Main method started... by : "+Thread.currentThread().getName());
	}
}