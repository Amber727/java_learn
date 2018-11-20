/**
	Test code
	@author amber
*/
class Demo
{
	public static void main(String[] args)
	{
		System.out.println(Integer.toBinaryString(-6));//打印整数-6的二进制表示
		
		/*
		变量定义
		类型 变量名 = 变量值;
		
		byte 	8bit
		short	16bit
		int		32bit(defualt)
		long	64bit
		
		float	32bit
		double	64bit(defualt)
		
		boolean	true false
		char	16bit
		
		*/
		
		//整数类型
		//1. byte 8bit
		byte b_min = -128;
		byte b_max = 127;
		System.out.println(b_min);
		System.out.println(b_max);
		
		//2.short 16bit
		short s_min = -32768;
		short s_max = 32767;
		System.out.println(s_min);
		System.out.println(s_max);
	
		//3.int 32bit  默认
		int i_min = -2147483648;
		int i_max = 2147483647;
		System.out.println(i_min);
		System.out.println(i_max);
		
		//4.long 64bit
		long l_min = -9223372036854775808l;
		long l_max = 9223372036854775807l;
		System.out.println(l_min);
		System.out.println(l_max);
		
		//浮点类型
		//1.float 32bit
		float f = 1.1f;
		System.out.println(f);
		
		//2.double 64bit  默认
		double d = 1.1;
		System.out.println(d);
		
		//字符型 char 0-65535 16bit Unicode编码
		char letter = 'a';
		System.out.println(letter);
		
		//boolean 布尔值，true false
		boolean ack = true;
		boolean nack = false;
		System.out.println(ack);
		System.out.println(nack);
		
		int x = 5;
		x = x + 2;
		System.out.println(x);
		
		/*
		类型转换
		byte short char 自动提升为int
		有一个是long	结果是long
		有一个是float	结果是float
		有一个是double	结果是double
		*/
		//强制类型转换（显式类型转换）
		byte b = 3;
		b = (byte)(b + 2);//将b+2的和，强制转换为byte类型
		
		//自动类型转换（隐式类型转换）
		System.out.println('a');
		System.out.println('a'+1); //char自动提升为int
	}
}