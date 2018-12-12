/*
 * 生产者消费者
 * 不止两个线程生产消费的场景
 * while
 * notifyAll
 *
*/

//资源
class Resource
{
	private String name;
	private int count;
	private boolean flag;

	//set方法 用来存储数据
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
		this.notifyAll();	//唤醒所有线程
	}

	//get方法 用于获取值
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
		this.notifyAll();	//唤醒所有线程
	}
}

//生产者 实现Runnable接口
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

//消费者 实现Runnable接口
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
		Resource res = new Resource();	//产生一个资源

		Producer pro = new Producer(res);	//实例化生产者
		Consumer con = new Consumer(res);	//实例化消费者

		new Thread(pro).start();
		new Thread(pro).start();
		new Thread(con).start();
		new Thread(con).start();
	}
}
