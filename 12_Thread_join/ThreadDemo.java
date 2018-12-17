
class Demo implements Runnable
{
	public void run()
	{
		for ( int x = 0 ; x < 10 ; x++)
		{
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().toString());
		}
	}
}
class ThreadDemo
{
	public static void main (String[] args)
	{
		Demo d = new Demo();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);

		t1.start();
		//join方法 使线程优先被处理
		//try{t1.join();} catch(InterruptedException e){ }
		t1.yield();

		t2.start();
		//try{t2.join();} catch(InterruptedException e){ }

		for ( int x = 0 ; x < 10 ; x++ )
		{
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().toString());
		}
	}
}
