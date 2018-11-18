/*
类的初始化过程

BeerInit b1 = new BeerInit(); 
1.加载类到内存中  static{}给类初始化
2.在堆内存中 开辟内存空间，分配内存地址
3.在堆内存中 建立对象特有属性 并进行默认初始化
4.对对象的属性进行显示初始化
5.对对象进行构造代码块初始化
6.对对象进行与之对应的构造函数初始化
7.将内存地址赋值给栈内存中的变量

*/
class BeerInit
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

	BeerInit()	//构造函数
	{
		foam();
	}

	BeerInit(String color)	//构造函数 重载
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
		BeerInit b1 = new BeerInit();
		b1.getColor();

		System.out.println("=============================================");

		BeerInit b2 = new BeerInit("black");
		b2.getColor();
	}
}
