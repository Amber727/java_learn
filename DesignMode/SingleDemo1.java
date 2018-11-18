/*
设计模式——单例设计模式
java一共有23种设计模式

单例设计模式：一个类在内存中只存在一个对象
1.饿汉式	此文为此方法 开发中用的多
2.懒汉式	用的少

方法：
1.将构造函数私有化		private xx(){}
2.在类里面就实例化一个对象出来(静态)	private static 实例化
2.定义一个静态方法 return 对象		public static getInstance()

*/

class Single1
{
	private int num;
	public void setNum(int num)
	{
		this.num = num;
	}

	public int getNum()
	{
		return num;
	}



	private Single1(){};	//私有化构造函数
	private static Single1 s = new Single1();	//实例化;饿汉法
	public static Single1 getInstance()	//创建一个public方法 叫getInstance() 返回的数据类型是Single1
	{
		return s;
	}
}

class SingleDemo1
{
	public static void main (String[] args)
	{
		Single1 s1 = Single1.getInstance();
		Single1 s2 = Single1.getInstance();		//其实对象s2和s1都是类中s对象的引用 ，所以内存地址是一样的
		
		s1.setNum(5);
		System.out.println("s1.getNum = " + s1.getNum());	//5
		System.out.println("s2.getNum = " + s2.getNum());	//也是5
		
	}
}
