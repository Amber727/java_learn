/*
 * String字符串的方法
 * 1.获取
 *		1.1 获取字符串长度
 *			int length();
 *		1.2 根据字符（串）内容查找所在位置
 *			int	indexOf(int ch) 
 *			int indexOf(int ch,int fromIndex)
 *			int	indexOf(String str) 
 *			int	indexOf(String str, int fromIndex) 
 *		1.3 根据位置获取字符
 *			char charAt(int index)
 *
 * 2.判断
 *		2.1 字符串中是否包含有一个子字符串
 *			boolean	contains(CharSequence s)
 *		2.2 字符串是否为空
 *			boolean	isEmpty() 
 *		2.3 字符串是否是以指定内容开头的
 *			boolean startsWith(String prefix)	//prefix 前缀
 *		2.4 字符串是否是以指定内容结尾的
 *			boolean	endsWith(String suffix)		//suffix 后缀，下标
 *		2.5 两个字符串内容是否相同
 *			boolean	equals(Object anObject) 
 *			boolean	equalsIgnoreCase(String anotherString)	//忽略大小写
 *
 * 3.转换
 *
 * */

class StringDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	//1 获取方法
	static void method_get(String str)
	{
		sop("str = " + str);

		//1.1 获取str字符串的长度
 		//	int length();
		sop("int length():  " + str.length());	//空格也算长度

		//1.2 查找字符所在的位置
 		//	int	indexOf(int ch) 
 		//	int indexOf(int ch,int fromIndex)
 		//	int	indexOf(String str) 
 		//	int	indexOf(String str, int fromIndex) 
		sop("int indexOf('s'):  " + str.indexOf('s'));  //查找字母s的所在位置（第一个s）
		sop("int indexOf('s',9):  " + str.indexOf('s',9));	//输出9  第二个s
		sop("int indexOf('s',10):  " + str.indexOf('s',10));	//输出16  第三个s
		sop("int lastIndexOf('s':  )" + str.lastIndexOf('s'));	//输出16  最后一个s
		sop("int indexOf('a'):  " + str.indexOf('a'));	//输出 13	区分大小写的
		sop("int indexOf('R'):  " + str.indexOf('R'));	//输出-1  R字符不存在
		sop("int indexOf(\"is\":  )" + str.indexOf("is"));	//输出6  查找字符串位置


		//1.3 查找某个位置上是什么字符
 		//	char charAt(int index)
		sop("char charAt(4):  " + str.charAt(4));

	}

	//2 判断方法
	static void method_judge(String str)	//judge 判断 审判
	{
		sop("str = " + str);
 		//2.1 字符串中是否包含有一个子字符串(字符不行)
 		//	boolean	contains(CharSequence s)
		sop("contains(\"handsome\"):  " + str.contains("handsome"));
		sop("contains(\"haha\"):  " + str.contains("haha"));
		
		//2.2 字符串是否为空
		//	boolean	isEmpty() 
		sop("isEmpty():  " + str.isEmpty());

		//2.3 字符串是否是以指定内容开头的
		//	boolean startsWith(String prefix)	//prefix 前缀
		sop("startsWith(\"Amber\":  )" + str.startsWith("Amber"));

		//2.4 字符串是否是以指定内容结尾的
		//	boolean	endsWith(String suffix)		//suffix 后缀，下标
		sop("endsWith(\"some\"):  " + str.endsWith("some"));

		// indexOf() 如果没有元素返回-1 所以也可以用于判断
		// 类似于contains()
		System.out.print("str.indexOf(\"some\" == -1):  ");
		sop( str.indexOf("some") != -1);
	}
	
	public static void main (String[] args)
	{
		String str = "Amber is so handsome";
		method_get(str);
		sop("");
		method_judge(str);

		//2.5 两个字符串内容是否相同
		//	boolean	equals(Object anObject) 
		sop("");
		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = "ABC";
		sop("s1 = " + s1);
		sop("s2 = " + s2);
		sop("s3 = " + s3);
		System.out.print("s1 == s2 :  ");
		sop(s1==s2);		//false 内存地址是否相同
		sop("s1.equals(s2):  " + s1.equals(s2));	//true
		sop("s1.equals(s3):  " + s1.equals(s3));	//false
		sop("s1.equalsIgnoreCase(s3):  " + s1.equalsIgnoreCase(s3));	//true

		//字符串方法的常见使用
		sop("");
		String filename = "ArrayDemo.java";
		sop("filename = " + filename);
		sop("filename.startsWith(\"Array\"):  " + filename.startsWith("Array"));
		sop("filename.endsWith(\".java\"):  " + filename.endsWith(".java"));
		sop("filename.contains(\"Demo\"):  " + filename.contains("Demo"));
	}
}
