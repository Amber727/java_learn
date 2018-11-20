/*
类的继承
java中 类只有单继承没有多继承 多继承通过接口的多实现来替代


定义一个父类 叫酒类Wine 所有的酒都有度数 所有的酒喝了都晕(有yun方法)

定义一个子类 叫啤酒类Beer 啤酒的构造函数继承父类Wine 啤酒还会冒泡(有maopao的方法) 啤酒喝了也晕，但是不是特晕(重写父类方法yun)
*/
abstract class Wine		//抽象类 酒Wine 酒的口感是不确定的
{
	double du;
	Wine(double du)	//构造函数，du：酒精度数
	{
		this.du = du;
	}

	void yun()
	{
		System.out.println("喝了晕");
	}

	void getDu()
	{
		System.out.println("酒精度数：" + du);
	}

	abstract void taste();		//抽象方法 口感不确定 需要子类覆盖
}

class Beer extends Wine		//Beer类继承Wine类
{
	//默认缺省的构造函数是 super();
	Beer(double du)
	{
		super(du);		//构造函数，super()调用父类Wine的构造方法
	}
	void maopao()
	{
		System.out.println("冒泡儿");
	}
	void yun()		//覆盖 也叫重写 覆盖了父类的yun方法
	{
		System.out.println("喝了也不是特别晕");
	}

	void taste()
	{
		System.out.println("Beer, 微苦 有淡淡的麦芽香气");
	}
}

class CraftBeer extends Beer		//精酿啤酒类 继承啤酒类
{
	CraftBeer(double du)
	{
		super(du);
	}
	void taste()
	{
		System.out.println("CraftBeer, 口感醇厚");
	}
}

class ExtendsDemo
{
	public static void main(String[] args)
	{
		Beer b = new Beer(3.6);
		b.yun();		//执行的是子类覆盖后的方法
		b.maopao();	
		b.getDu();		//子类的对象调用父类的方法
		b.taste();

		System.out.println("-----------------------");


		CraftBeer cb = new CraftBeer(11.5);
		cb.yun();		//Wine类中的方法
		cb.maopao();	//Beer类中的方法
		cb.getDu();
		cb.taste();
	}
}
