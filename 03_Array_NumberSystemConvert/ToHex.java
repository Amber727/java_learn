class ToHex
{
	public static void main (String[] args)
	{
		toHex(-60);
	}

	public static void toHex(int num)
	{
		if (num == 0)
		{
			System.out.println(0);
			return;
		}

		char[] chs = { '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F' };
		char[] arr = new char[32];
		int pos = arr.length;
		System.out.print("toHex("+num+") = ");
		while ( num != 0 )
		{
			int temp = num & 15;
			arr[--pos] = chs[temp];
			num = num >>> 4;
		}

		for ( int x = 0; x < arr.length; x++)
		{
			System.out.print(arr[x]);
		}
		System.out.println();
	}
}
