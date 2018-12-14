/*
 * JDK1.5 以后的新功能
 * Condition类将原来的Object类中的wait notify notifyAll 重新封装
 * 支持一个锁 多应多个Condition实例
 * 从而notify的时候只唤醒需要唤醒的线程 而无需全部唤醒
 * 
 * 依旧以生产者消费者的事情为例
*/
import java.util.concurrent.locks.*;

class Resource
{
	private String name;
	private int count = 1;

	private boolean flag;	//默认false 表示没有存入东西

	private Lock lock = new ReentrantLock();	//创建一个锁
	private Condition condition_pro = lock.newCondition();	//基于lock锁 生成者的condition实例
	private Condition condition_con = lock.newCondition();	//基于lock锁 消费者的condition>实例	

	public void set(String name) throws InterruptedException
	{
		lock.lock();

		try
		{
			while (flag)
			{
				condition_pro.await();
			}
			this.name = name + "--" + count++;
			System.out.println(Thread.currentThread().getName() + "...set..." + this.name);
			flag = true;
			condition_con.signal();
		}
		finally
		{
			lock.unlock();
		}
	}

	public void get() throws InterruptedException
	{
		lock.lock();

		try
		{
			while (!flag)
			{
				condition_con.await();
			}
			System.out.println(Thread.currentThread().getName() + "......get......" + name );
			flag = false;
			condition_pro.signal();
		}
		finally
		{
			lock.unlock();
		}
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
		while ( true )
		{
			try
			{
				res.set(" 商品 ");
			}
			catch ( InterruptedException e)
			{
			}
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
		while ( true )
		{
			try
			{
				res.get();
			}
			catch ( InterruptedException e )
			{
			}
		}
	}
}

class ConditionDemo
{
	public static void main (String[] args)
	{
		Resource res = new Resource();

		Producer pro = new Producer(res);
		Consumer con = new Consumer(res);

		/*
		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(pro);
		Thread t3 = new Thread(con);
		Thread t4 = new Thread(con);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		*/

		new Thread(pro).start();
		new Thread(pro).start();
		new Thread(con).start();
		new Thread(con).start();
	}
}
