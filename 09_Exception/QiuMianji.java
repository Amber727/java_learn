/*
 * 求长方形或圆形的面积
 * 自定义负数异常
 * 异常应继承RuntimeException 使程序结束
 * */

//自定义异常，由于求面积的时候用户可能传入负数作为参数，应抛出异常并且不让用户进行处理，终止程序，因为可能面积的值在后面程序要调用这个面积的值，所以不应该继承Exception父类，而是应继承RuntimeException
class NegativeException extends RuntimeException
{
	NegativeException(String message)
	{
		super(message);
	}
}

interface GetArea
{
	double getArea();
}

//Rectangle长方形，是GetArea接口的实现；
//即Rectangle增加了GetArea的功能
class Rectangle implements GetArea
{
	private int length, wide;
	Rectangle(int len, int wid) //RuntimeException的子类不用写throws
	{
		if ( len <= 0 || wid <=0 )
			throw new NegativeException("负数异常！");
		this.length = len;
		this.wide = wid;
	}

	//重写接口的getArea方法
	public double getArea()
	{
		return length*wide;
	}
}

class Circle implements GetArea
{
	private int radius;	//radius 半径
	Circle(int radius)
	{
		if ( radius <= 0 )
			throw new NegativeException("负数异常！！！");
		this.radius = radius;
	}

	public double getArea()
	{
		double PI = 3.1415927;
		return PI*radius*radius;
	}
}


class QiuMianJi
{
	public static void main (String[] args)
	{
		//Rectangle  r = new Rectangle(3,-4);
		//System.out.println("Rectangle Area: "+ r.getArea());

		Circle c = new Circle(-3);
		System.out.println("Circle Area: " + c.getArea());
	}
}
