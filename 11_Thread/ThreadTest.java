/*
 * 练习：
 * 编写程序实现两个线程与主函数线程交替运行
 *
 * Thread类中的常用方法：
 * 1.static Thread currentThread(): 获取当前线程对象
 * 2.getName(): 获取线程名称
 * 3.setName(): 设置线程名称 也可用Thread类的构造方法直接设置
 * 
*/

class MultiDemo extends Thread
{
	//private String name;
	MultiDemo(String name)
	{
		//this.name = name;
		//父类Thread构造函数中可以直接传入线程名称 所以不用自己写了
		super(name);
	}
	public void run()
	{
		for ( int x=0 ; x<100 ;x++)
		{
			//System.out.println(this.getName()+" run ..."+x);
			//两种获取线程名称的效果相同
			System.out.println(Thread.currentThread().getName() + " run ..." +x);
		}
	}
}

class ThreadTest
{
	public static void main(String[] args)
	{
		MultiDemo d1 = new MultiDemo("d1");
		MultiDemo d2 = new MultiDemo("d2");
		d1.start();
		d2.start();

		for ( int x=0; x<100 ; x++)
		{
			System.out.println("main run ..."+x);
		}
	}
}
