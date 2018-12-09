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
	/*
	private String name;
	TicketWindowRunnable(String name)
	{
		this.name = name;
	}
	*/

	/*多个线程要共享100张票 所以tick_num必须是静态的 否则将会每个窗口卖出100张票
	private static int tick_num = 100;
	*/

	//由于通过实现Runnable接口的方式创建线程 实例化的时候仅仅是一个实例对象
	//所以可以不用static修饰 tick_num也可以
	private int tick_num = 5000;
	public void run()
	{
		while( tick_num > 0)
		{
			System.out.println(Thread.currentThread().getName()+" sale: "+ tick_num--);
			//下面这种方法不可以用了
			//System.out.println(this.name + " sale: "+ tick_num--);
		}
	}
}

class SaleTicketRunnable
{
	public static void main(String[] args)
	{
		TicketWindowRunnable t = new TicketWindowRunnable();

		new Thread(t).start();	//开启一个线程
		new Thread(t).start();  //又开启一个线程
		new Thread(t).start();
		new Thread(t).start();

		/*
		Thread t1 = new Tread(t);
		Thread t2 = new Tread(t);
		Thread t3 = new Tread(t);
		Thread t4 = new Tread(t);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		*/
	}
}
