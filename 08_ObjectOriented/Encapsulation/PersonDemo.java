class Person
{
	private String name;	//private定义私有成员属性，存在堆内存，初始化字符串为null
	private int age;		//初始化值为0
	//一般会给每个私有属性 写两个配套的方法 一个set 一个get
	//这样我们就可以在设置的时候加以限制
	
	/*
	构造代码块，开发中不常用
	给对象进行初始化，优先于构造函数，用于定义对象共性的初始化内容
	给所有对象进行统一初始化，而构造函数是给对应的对象初始化
	*/
	{
		System.out.println("这是一个人");
	}

	Person()	//构造函数
	{
		speak();
		Cry();
	}

	Person(String n)	//构造函数 函数重载
	{
		name = n;
	}

	Person(String n, int a)	//构造函数 函数重载
	{
		name = n;
		age = a;
	}

	void Cry()
	{
		System.out.println("Cry.......");
	}

	public void setName (String n)
	{
		name = n;
	}

	public String getName ()
	{
		return name;
	}

	public void setAge (int a)
	{
		if ( a >= 0)
			age = a;
		else
			System.out.println("Age Error");
	}

	public int getAge ()
	{
		return age;
	}

	void speak()
	{
		System.out.println("name : "+name+", age : "+age);
	}
}

class PersonDemo
{
	public static void main (String[] args)
	{
		Person p1 = new Person();	//创建一个新对象p1
		p1.Cry();	//调用成员方法
		System.out.println("======================================");

		p1.setName("Amber");
		p1.setAge(18);
		p1.speak();
		System.out.println("======================================");

		Person p2 = new Person("Tom");
		p2.speak();
		System.out.println("======================================");

		Person p3 = new Person("Jerry",1);
		System.out.println(p3.getName());
		System.out.println(p3.getAge());
		System.out.println("======================================");

		Person p4 = new Person("zhangsan");
		p4.setAge(-1);
	}
}
