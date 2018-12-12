/*
 * 生产者消费者
 *
 * 多个线程向共同的内存空间存储数据
 * 多个线程从共同的内存空间读取数据
 *
 * 
*/

//共同的内存空间
//存储name和count
class Resource
{
	private String name;
	private int count = 1;
	private boolean flag = false;

	public synchronized void set(String name)
	{
		if (flag)
		{
			try
			{
				this.wait();
			}
			catch ( InterruptedException e )
			{

			}
		}
		this.name = name;
		System.out.println(Thread.currentThread().getName() + "...生产了..." + count++);
		flag = true;
		this.notify();
	}

	public synchronized void get()
	{
		if (!flag)
		{
			try
			{
				this.wait();
			}
			catch ( InterruptedException e)
			{	}
		}
		System.out.println(Thread.currentThread().getName() + "......消费了......" + count);
		flag = false;
		this.notify();
	}
}

//生产者
class Producer implements Runnable
{
	private Resource res;

	Producer(Resource res)
	{
		this.res = res;
	}

	private boolean flag = false;
	public void run()
	{
		while (true)
		{
			res.set(" 商品 ");
		}
	}
}

//消费者
class Consumer implements Runnable
{
	private Resource res;

	Consumer(Resource res)
	{
		this.res = res;
	}

	private boolean flag = false;
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
	public static void main(String[] args)
	{
		Resource res = new Resource();

		Consumer con = new Consumer(res);
		Producer pro = new Producer(res);

		new Thread(con).start();
		new Thread(pro).start();
	}
}
