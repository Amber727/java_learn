/*
判断一个数字列表中，是否含有某个元素，返回布尔值
*/

class hasEle
{
	public static boolean hasEle(int num, int[] arr)
	{
		for( int x = 0 ; x < arr.length; x++)
		{
			if ( num == arr[x])
				return true;
		}
		return false;
	}

	public static void main (String[] args)
	{
		int[] arr = {1,2,3};
		
		System.out.println(hasEle(2,arr));
	}
}
