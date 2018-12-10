/*
 * 多线程
 * 同步代码块解决多线程抢占问题
 *
*/

class Ticket implements Runnable
{
	private int tick = 100;
	public void run()
	{
		synchronized (Ticket.class)
		{
			while(tick > 0)
			{
				try{ Thread.sleep(2); } catch(Exception e){}
				System.out.println(Thread.currentThread().getName()+" ...sale: " + tick--);
			}
		}
	}
}

class TicketSynchronized
{
	public static void main(String[] args)
	{
		Ticket t = new Ticket();

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);

		t1.start();
		t2.start();
	}
}
