/*
设计模式——单例设计模式
java一共有23种设计模式

单例设计模式：一个类在内存中只存在一个对象
1.饿汉式	开发中用的多
2.懒汉式	此文为此方法	用的少	延迟加载

方法：
1.将构造函数私有化		private xx(){}
2.在类里面不初始化对象  null
3.定义一个静态方法 return 对象		public static getInstance()

*/

class Single2
{
	private Single2(){};	//私有化构造函数
	private static Single2 s = null;	//推迟加载；懒汉式
	public static Single2 getInstance()	//创建一个public方法 叫getInstance() 返回的数据类型是Single2
	{
		if (s==null)
			s = new Single2();
		return s;
	}
}

class SingleDemo2
{
	public static void main (String[] args)
	{
		Single2 s1 = Single2.getInstance();
		Single2 s2 = Single2.getInstance();		//其实对象s2和s1都是类中s对象的引用 ，所以内存地址是一样的
	}
}
