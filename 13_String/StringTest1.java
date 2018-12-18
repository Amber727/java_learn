/*
 * StringTest1 将字符串的指定元素翻转输出
 * 若不写指定的元素 默认全部翻转
 * 
 * 思路：
 *		1.将字符串转换为字符数组
 *		2.将数组翻转
 *		3.将翻转后的数组转换为字符串
*/

class StringTest1
{
	//部分翻转
	public static String reverse(String str , int start, int end)
	{
		//1.将字符串转换为字符数组
		char[] c = str.toCharArray();

		//2.将数组翻转
		char[] ch = swap(c, start , end);

		//3.将翻转后的数组转换为字符串
		String s = new String(ch);

		return s;
	}

	//全部翻转
	public static String reverse(String str)
	{
		String s = reverse(str,0,str.length()-1);
		return s;
	}

	//数组内元素调换位置
	private static char[] swap(char[] c, int x ,int y)	//x是开始的角标 y是结束的角标
	{
		for ( int start = x , end = y ; start <= end ; start++ , end--)
		{
			char temp = c[start];
			c[start] = c[end];
			c[end] = temp;
		}
		return c;
	}

	public static void main(String[] args)
	{
		String str = "abcdef";
		System.out.println( "str = " + str );
		System.out.println( "reverse(str, 1, 3):  " + reverse(str, 1, 3) );
		System.out.println( "reverse(str):  " + reverse(str) );
	}
}
