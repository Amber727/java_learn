/*
 * 多线程：
 * 1.定义一个Demo类 继承Thread类
 * 2.重写Thread类中的run方法 把要执行的代码写到run方法中
 * 3.实例化自己定义的Demo类 d.start()方法会调用run方法
 *
 * 多线程实现的效果：
 * 多个线程随机抢占CPU的计算资源 所以每次打印出来的效果也是不同的
 *
 * 注意：不能直接使用d.run()方法，直接用的话是main线程去执行的，而并非真正意义上的多线程
 * */
class Demo extends Thread
{
	public void run()
	{
		for( int x = 0; x < 100 ; x++)
			System.out.println("Demo--"+x);
	}
}

class ThreadDemo
{
	public static void main(String[] args)
	{
		Demo d = new Demo();
		d.start();

		for(int x = 0; x < 100; x++)
			System.out.println("Main--"+x);
	}
}
