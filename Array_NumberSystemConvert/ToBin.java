class ToBin
{
	public static void main (String[] args)
	{
		toBin(-6);
	}

	//十进制转二进制
	public static void toBin(int num)
	{
		if (num == 0)
		{
			System.out.println(0);
			return;
		}
		int [] arr = new int[32];  //定义一个数组arr，用来存放转换后的32位二进制数
		int pos = arr.length;  //定义一个指针，用于操作arr数组。
							   //后续数组将以倒着的顺序往里写入，打印的时候正着打印
		System.out.print("toBin("+num+")= " );

		while ( num != 0 )	//循环每次将num右移1位，直到没有有效位了，循环结束
		{
			int temp = num & 1;
			arr[--pos] = temp;
			num = num >>> 1;
		}

		for ( int x = pos; x < arr.length; x++)
		{
			System.out.print(arr[x]);
		}
		System.out.println();
	}
}
