/*
 * 生产者消费者
 * 不止两个线程生产消费的场景
 * while
 * notifyAll
 *
*/

class Resource
{
	private String name;
	private int count;
	private boolean flag;

	public synchronized void set(String name)
	{
		while (flag)
		{
			try
			{
				this.wait();
			}
			catch ( InterruptedException e )
			{	}
		}
		this.name = name;
		System.out.println(Thread.currentThread().getName() + "...生产者..." + count++);
		flag = true;
		this.notifyAll();
	}

	public synchronized void get()
	{
		while (!flag)
		{
			try
			{
				this.wait();
			}
			catch ( InterruptedException e)
			{	}
		}
		System.out.println(Thread.currentThread().getName() + "......消费者......" + count);
		flag = false;
		this.notifyAll();
	}
}

class Producer implements Runnable
{
	private Resource res;
	Producer(Resource res)
	{
		this.res = res;
	}

	public void run()
	{
		while (true)
		{
			res.set(" 商品 ");
		}
	}
}

class Consumer implements Runnable
{
	private Resource res;
	Consumer(Resource res)
	{
		this.res = res;
	}

	public void run()
	{
		while (true)
		{
			res.get();
		}
	}
	
}

class ProducerConsumer
{
	public static void main (String[] args)
	{
		Resource res = new Resource();

		Producer pro = new Producer(res);
		Consumer con = new Consumer(res);

		new Thread(pro).start();
		new Thread(pro).start();
		new Thread(con).start();
		new Thread(con).start();
	}
}
