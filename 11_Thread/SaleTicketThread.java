/*
 * 需求：
 * 编写模拟售票系统 多线程相当于多个窗口
 * 一共100张票
 * 卖完程序结束
 *
*/

class TicketWindowThread extends Thread
{
	TicketWindowThread(String name)
	{
		super(name);
	}
	//多个线程要共享100张票 所以tick_num必须是静态的 否则将会每个窗口卖出100张票
	private static int tick_num = 100;
	public void run()
	{
		while( tick_num> 0)
		{
			System.out.println(Thread.currentThread().getName()+" sale: "+ tick_num--);
		}
	}
}

class SaleTicketThread
{
	public static void main(String[] args)
	{
		TicketWindowThread t1 = new TicketWindowThread("t1");
		TicketWindowThread t2 = new TicketWindowThread("t2");
		TicketWindowThread t3 = new TicketWindowThread("t3");
		TicketWindowThread t4 = new TicketWindowThread("t4");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
