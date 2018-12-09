/*
 * 需求：
 * 编写模拟售票系统 多线程相当于多个窗口
 * 一共100张票
 * 卖完程序结束
 *
 * 使用Runnable接口实现的方法
*/

class TicketWindowRunnable implements Runnable
{
	private String name;
	TicketWindowRunnable(String name)
	{
		this.name = name;
	}
	//多个线程要共享100张票 所以tick_num必须是静态的 否则将会每个窗口卖出100张票
	private static int tick_num = 100;
	public void run()
	{
		while( tick_num> 0)
		{
			//System.out.println(Thread.currentThread().getName()+" sale: "+ tick_num--);
			System.out.println(this.name + " sale: "+ tick_num--);
		}
	}
}

class SaleTicketRunnable
{
	public static void main(String[] args)
	{
		TicketWindowRunnable t1= new TicketWindowRunnable("t1");
		TicketWindowRunnable t2= new TicketWindowRunnable("t2");
		TicketWindowRunnable t3= new TicketWindowRunnable("t3");
		TicketWindowRunnable t4= new TicketWindowRunnable("t4");

		new Thread(t1).start();
		new Thread(t2).start();
		new Thread(t3).start();
		new Thread(t4).start();
	}
}
