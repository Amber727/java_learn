/*
 * 基本数据类型包装类
 * byte		Byte
 * short	Short
 * int		Integer
 * long		Long
 * boolean	Boolean
 * float	Float
 * double	Double
 * char		Character
 *
 * 基本数据类型与字符串间的转换
 * 1.基本数据类型转成字符串
 *		(1)基本数据类型+""
 *		(2)基本数据类型.toString(基本数据类型值)
 *		例如：Integer.toString(34); //将整数型的34转换成字符串"34"
 *		
 * 2.将字符串转成基本数据类型
 *		格式：xxx a = parsexxx(str);
 *		例如：
 *		int i = parseInt("123");
 *		long l = parseLong("123");
 *		double d = parseDouble("1.2");
 *		boolean b = parseBoolean("true");
 *
 * 进制转换
 * 1.十进制转其他进制
 *		toBinaryString();
 *		toHexString();
 *		toOctalString();
 *
 * 2.其他进制转十进制
 * */

class IntegerDemo
{
	public static void main (String[] args)
	{
		//sop("Max: " + Integer.MAX_VALUE);	//打印int的最大值
		//sop("Min: " + Integer.MIN_VALUE);	//打印int的最小值

		//整数型 转 字符串
		String s = Integer.toString(123);
		sop("Integer.toString(123)" + getType(s));
		sop(getType(123+""));

		//字符串 转 整数型
		int i = Integer.parseInt("123");
		sop("Integer.parseInt(\"123\"): " + getType(i));

		//字符串 转 长整数型
		long l = Long.parseLong("123");
		sop("Long.parseLong(\"123\"): " + getType(l));

		//十进制数转二进制数
		sop("Integer.toBinaryString(-6)" + Integer.toBinaryString(-6));

	}

	public static void sop(String str)
	{
		System.out.println(str);
	}
	public static String getType(Object o){
		 return o.getClass().toString(); //使用int类型的getClass()方法
	}
}
