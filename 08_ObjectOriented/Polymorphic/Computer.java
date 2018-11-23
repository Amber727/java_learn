/*
接口 多态
需求：
定义计算机主板 class MainBord上有很多接口
实例化一个主板 可以调用接口所扩展的网卡 声卡等

接口可以扩展功能 降低代码的耦合度 定义规范
多态 这个案例中的多态 是接口接口的引用指向自己的子类

先定义一个接口interface PCI
网卡接口 NetCard()
声卡接口 SountCard()
*/
interface PCI		//定义一个接口叫PCI
{
	public void open();		//定义接口的规范 要有open和close方法
	public void close();
}

class MainBoard
{
	public void run()
	{
		System.out.println("MainBoard run");
	}

	public void usePCI( PCI p )		//使用PCI接口的功能
	{
		if ( p != null)		//有可能PCI接口没有插入任何东西，那么将不能调用p.open()和p.close()
		{
			p.open();
			p.close();
		}
	}
}

class NetCard implements PCI	//创建网卡类 实现PCI接口
{
	public void open()		//覆写PCI接口的open方法
	{
		System.out.println("NetCard open");
	}
	public void close()
	{
		System.out.println("NetCard close");
	}
}

class SoundCard implements PCI
{
	public void open()
	{
		System.out.println("SoundCard open");
	}
	public void close()
	{
		System.out.println("SoundCard close");
	}
}


class Computer
{
	public static void main (String[] args)
	{
		MainBoard mb = new MainBoard();
		mb.run();
		mb.usePCI(null);		//PCI接口什么都没插入
		mb.usePCI(new NetCard());   //PCI接口插入个网卡 mb.usePCI( PCI p = new NetCard());   多态
		mb.usePCI(new SoundCard());
	}
}
