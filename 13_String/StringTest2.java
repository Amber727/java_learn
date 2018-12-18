/*
 * StringTest2 去除字符串首尾空格
 * 思路：
 *		1.使用charAt(int index)方法判断是否为空格获得角标位置
 *		2.使用substring(int beginIndex , int endIndex)方法获取结果
 * */

class StringTest2
{
	public static String myTrim(String str)
	{
		int start = 0;
		int end = str.length()-1;
		while ( str.charAt(start) == ' ' )
			start++;
		while ( str.charAt(end) == ' ' )
			end--;
		String s = str.substring(start, end+1);
		return s;
	}

	public static void main(String[] args)
	{
		String str = "   ab cd     ";
		System.out.println( myTrim(str) );
	}
}
