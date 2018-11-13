class toBinOctHex
{
	public static void main (String[] args)
	{
		toBin(6);
		toOct(8);
		toHex(60);
	}

	public static void toBin (int num)
	{
		System.out.print("toBin("+num+") = ");
		toBinOctHex(num, 2, 1);
	}
	public static void toOct (int num)
	{
		System.out.print("toOct("+num+") = ");
		toBinOctHex(num, 8, 3);
	}
	public static void toHex (int num)
	{
		System.out.print("toHex("+num+") = ");
		toBinOctHex(num, 16, 4);
	}

	//定义一个可以转换为2、8、16进制的函数;
	public static void toBinOctHex (int num, int system, int move) //要准换的数，要转成几进制，右移几位;
	{
		if (num == 0)
		{
			System.out.println(0);
			return;
		}
		
		char[] chs = { '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F' };
		char[] arr = new char[32];
		int pos = arr.length;

		while ( num != 0 )
		{
			int temp = num & system-1;
			arr[--pos] = chs[temp];
			num = num >>> move;
		}

		for ( int x = 0 ; x < arr.length; x++)
		{
			System.out.print(arr[x]);
		}

		System.out.println();
	}
}
