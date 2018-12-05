/*
 * 求圆形或长方形面积
 * 圆形输入半径
 * 长方形输入长宽
 * */

//自定义异常 NegativeException 负数异常，继承Exception
class NegativeException extends Exception
{
	NegativeException(String message)
	{
		super(message);	//使用父类的构造方法 Exception(String message) 
	}
}

interface MianJi	//接口 求面积并返回一个浮点数 求面积作为了一个扩展功能
{
	double getArea();
}

class Rectangle implements MianJi
{
	private int len , wid;
	//构造方法，由于使用者有可能会传入负数的不合法参数，抛出上面自定义的负数异常
	Rectangle(int len, int wid) throws NegativeException
	{
		if ( len <= 0 || wid <= 0)
			throw new NegativeException("负数异常!");	//抛出异常对象
		this.len = len;
		this.wid = wid;
	}
	public double getArea()
	{
		return len*wid;
	}
}

class QiuMianJi
{
	public static void main (String[] args)
	{
		try
		{
			Rectangle r = new Rectangle(3,-4);
			System.out.println("The rectangle's area is: "+r.getArea());
		}
		catch(NegativeException e)	//捕捉自定义负数异常
		{
			System.out.println(e.toString()); //父类Exception的方法
			//System.out.println(e.getMessage());
		}
		System.out.println("over.");
	}
}
