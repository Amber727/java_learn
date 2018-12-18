/*
 * String 字符串的方法
 * 3.转换
 *		3.1	将字符数组转换成字符串
 *			构造方法: 
 *			String(char[] value);
 *			String(char[] value, int offset, int count);  //数组中的一部分元素转换成字符串
 *			静态方法:
 *			static String	copyValueOf(char[] data);
 *			static String	copyValueOf(char[] data, int offset, int count);
 *			static String	valueOf(char[] data);
 *			static String	valueOf(char[] data, int offset, int count);
 *
 *
 *		3.2	将字符串转换成字符数组
 *			char[]	toCharArray();
 *
 *		3.3	将字节数组转换成字符串
 *			构造方法:
 *			String(byte[] bytes);
 *			String(byte[] bytes, int offset, int length);
 *
 *		3.4	将字符串转换成字节数组
 *			byte[]	getBytes();
 *
 *		3.5 其他类型数据转换成字符串
 *			static String	valueOf(boolean b);
 *			static String	valueOf(char c);
 *			static String	valueOf(double d);
 *			static String	valueOf(float f);
 *			static String	valueOf(int i);
 *			static String	valueOf(long l);
 *			static String	valueOf(Object obj);
 *
 * 4.替换
 *		String	replace(char oldChar, char newChar);
 *
 * 5.切割
 *		String[]	split(String regex);
 *
 * 6.子串 获取字符串中的一部分
 *		String	substring(int beginIndex);
 *		String	substring(int beginIndex, int endIndex);
 *
 * 7.其他常用方法
 *		7.1 大小写转换 
 *		String	toUpperCase();
 *		String	toLowerCase();
 *
 *		7.2 去首尾空格
 *		String	trim();
 *
 *		7.3 对两个字符串进行自然顺序比较
 *		int	compareTo(String anotherString);
 * */
class StringDemo_trans
{
	//3. 转换
	public static void method_trans()
	{
 		//3.1	将字符数组转换成字符串
 		//	构造方法: 
 		//	String(char[] value);
		char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f' };
		String s1 = new String(arr);
		sop("s1 = " + s1);
 	
		//	String(char[] value, int offset, int count);  //数组中的一部分元素转换成字符串
		String s2 = new String(arr, 1, 3);	//输出 bcd
		sop("s2 = " + s2);

 		//	静态方法:
 		//	static String	copyValueOf(char[] data);
		sop("String.copyValueOf(arr):  " + String.copyValueOf(arr));
		
 		//	static String	copyValueOf(char[] data, int offset, int count);
		sop("String.copyValueOf(arr, 1 , 3):  " + String.copyValueOf(arr,1,3));

 		//	static String	valueOf(char c);
		sop("String.valueOf(arr):  " + String.valueOf(arr));

 		//	static String	valueOf(char[] data, int offset, int count);
		sop("String.valueOf(arr, 1 ,3 ):  " + String.valueOf(arr,1,3));

 		//3.2	将字符串转换成字符串数组
 		//	char[]	toCharArray();
		sop("");
		String str = "abcdf";
		char[] c = str.toCharArray();
		System.out.print("str.toCharArray():  ");
		printArray(c);

 		//3.3	将字节数组转换成字符串
 		//	构造方法:
 		//	String(byte[] bytes);
		sop("");
		byte[] b = { 'a' , 'b' , 'c' , 'd', 'e' };
		String byte2string1 = new String(b);
		sop("new String(b):  " + byte2string1);

 		//	String(byte[] bytes, int offset, int length);
		String byte2string2 = new String(b, 1, 3);
		sop("new String(b , 1, 3):  " + byte2string2);
 
 		//3.4	将字符串转换成字节数组
 		//	byte[]	getBytes();
		//byte[] b1 = str.getBytes();
	}

	//4.替换
	public static void method_replace()
	{
 		//	String	replace(char oldChar, char newChar);
		sop("");
		String str1 = "amber liu";
		String s1 = str1.replace("liu", "刘");
		sop("str1.replace(\"liu\", \"刘\"):  " + s1);

		String str2 = "Hello Java";
		String s2 = str2.replace('a', 'n');
		sop("str2.replace('a', 'n'):  " + s2);	//输出 Hello Jnvn

		String s3 = str2.replace('z', 'n');
		sop("str2.replace('z', 'n'):  " + s3);	//输出 str2 z不存在 返回原字符串
	}

	//5.切割
	public static void method_split()
	{
		//	String[]	split(String regex);
		String str = "zhangsan,lisi,wangwu";
		String[] names = str.split(",");
		System.out.print("str.split(\",\"):  ");
		printArray(names);
	}

	//6.子串 获取字符串中的一部分
	public static void method_substring()
	{
 	//	String	substring(int beginIndex);
	sop("");
	String str = "abcd efg";
	sop("str = " + str);
	String s1 = str.substring(2);
	sop("str.substring(2):  " + s1);

 	//	String	substring(int beginIndex, int endIndex);
	String s2 = str.substring(1,3);
	sop("str.substring(1,3):  " + s2);	//输出bc	含头不含尾

	}


	//7.其他常用方法
	public static void method_other()
	{
		//	7.1 大小写转换
		//	String	toUpperCase();
		sop("");
		String str = "    Hello World!  ";
		sop("str = (" + str + ")");
		sop("str.toUpperCase():  " + str.toUpperCase());
		//	String	toLowerCase();
		sop("str.toLowerCase():  " + str.toLowerCase());

		//	7.2 去首尾空格
		//	String	trim();
		String s2 = str.trim();
		sop("str.trim(): (" + s2 + ")");

		//	7.3 对两个字符串进行自然顺序比较
		//	int	compareTo(String anotherString);
		String name1 = "abc";
		String name2 = "aac";
		int x = name1.compareTo(name2);		//按顺序比较 再用字符编码的值相减 如第一个a字母相同 看第二个字母 b是98 a是97 返回值是98-97的差
		sop("name1.compareTo(name2):  " + x);
	}
	public static void main(String[] args)
	{
		method_trans();
		method_replace();
		method_split();
		method_substring();
		method_other();
	}

	private static void printArray(char[] arr)
	{
		System.out.print('[');
		for (int x = 0; x < arr.length ; x++)
		{
			System.out.print(arr[x]);
		}
		sop("]");
	}
	private static void printArray(String[] arr)
	{
		System.out.print('[');
		for (int x = 0; x < arr.length ; x++)
		{
			System.out.print(arr[x] + " ");
		}
		sop("]");
	}

	public static void sop(String str)
	{
		System.out.println(str);
	}
	public static void sop(int x)
	{
		System.out.println(x);
	}
}
