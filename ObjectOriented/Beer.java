class Beer
{
	String color = "yellow";	//成员属性的显示初始化

	static
	{
		//静态代码块，随着类的加载而加载，优先于对象而存在
		System.out.println("static代码块");
	}

	{
		//构造代码块，创建对象时加载，优先于构造函数
		System.out.println("构造代码块");
	}

	Beer()	//构造函数
	{
		foam();
	}

	Beer(String color)	//构造函数 重载
	{
		this();		//this语句 构造函数之间的调用，调用的是上面Beer()函数。必须写在第一行
		this.color = color;		//this代表对象本身
	}

	private static void foam ()		//私有 静态方法 起泡沫；静态用来修饰所以对象所共有的
	{
		System.out.println("foam run");
	}

	public void getColor()
	{
		System.out.println("color = " + this.color);
	}
}

class BeerDemo
{
	public static void main (String[] args)
	{
		Beer b1 = new Beer();
		b1.getColor();

		System.out.println("=============================================");

		Beer b2 = new Beer("black");
		b2.getColor();
	}
}
