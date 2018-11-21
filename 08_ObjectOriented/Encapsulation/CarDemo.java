class Car
{
	String color = "red"; //车身颜色
	int tnum = 4; //tire number 轮胎个数

	void run()
	{
		System.out.println("color: " + color + "  tnum: " + tnum);
	}
}

class CarDemo
{
	public static void main (String[] args)
	{
		Car c1 = new Car();
		c1.color = "blue";	//将对象c1的颜色改为blue

		Car c2 = c1;	//将c1的内存地址赋值给c2，所以c2对象和c1所引用的内存地址是一个空间
		c2.tnum = 6;	//修改c2.tnum实质上是修改堆内存中的数据，所以相同的引用都会变

		c1.run();	//blue, 6
	}
}

