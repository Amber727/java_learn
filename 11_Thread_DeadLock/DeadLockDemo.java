/*
 * 多线程死锁问题
 *
*/


class TicketDead implements Runnable
{
	private int tick = 2000;
	Object obj = new Object();
	boolean flag = true;
	
	public void run()
	{
		if (flag)
		{
			while (tick > 0)
			{
				synchronized(obj)
				{
					show();
				}
			}
		}
		else
		{
			while (tick > 0)
			{
				show();
			}
		}
		
	}

	public synchronized void show()	//同步函数默认锁是 this
	{
		synchronized (obj)
		{
			try{Thread.sleep(2);} catch(Exception e){}
			System.out.println(Thread.currentThread().getName() + " sale...." + tick--);
		}
	}
	
}

class DeadLockDemo
{
	public static void main(String[] args)
	{
		TicketDead t = new TicketDead();

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);

		t1.start();
		try{Thread.sleep(2);} catch(Exception e){}
		t.flag = false;
		t2.start();
	}
}
