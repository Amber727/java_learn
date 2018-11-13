class DoubleArray
{
	public static void main (String[] args)
	{
		/*
		第一种定义方法
		int[][] arr = new int[3][2]; //创建一个二维数组arr，arr中有三个一维数组，每个一维数组中有两个元素
		*/

		/*
		第二种定义方法
		int[][] arr = new int[3][]; //创建一个二维数组arr，arr中有三个一维数组，每个一维数组中的元素个数不确定，下面需要再指定
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[1];
		*/

		int[][] arr = { {1,2,3} , {1,2} ,{1} };
		sumDouArr(arr);
	}

	//二维数组元素求和，遍历每个一维数组求和后，再求和
	public static void sumDouArr (int[][] arr)
	{
		int sum = 0;
		for ( int x = 0; x < arr.length ; x++)
		{
			for ( int y = 0; y < arr[x].length; y++)
			{
				sum += arr[x][y];
			}
		}
		System.out.println("sum=" + sum);
	}
}
