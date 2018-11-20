/*
$ javadoc -d myhelp -author -version ArrayTool.java
-d 指定帮助文档存放路径
-author 显示作者信息
-version 显示版本信息
*/

/**
这是一个可以操作int数组的类，包含取最值、排序、打印等方法。
@author Amber
@version V1.0
*/
public class ArrayTool
{
	/**空参数构造函数*/
	private ArrayTool(){};	//将构造函数私有化 禁止这个类创建对象 直接用类名.方法就可以

	/**
	获取int数组中的最大值
	@param arr 接收一个int类型的数组
	@return 返回最大值
	*/
	public static int getMax(int[] arr)
	{
		int max = 0;
		for (int x = 1; x < arr.length ; x++)
		{
			if ( arr[max] < arr[x] )
				max = x;
		}
		return arr[max];
	}

	/**
	获取int数组中的最小值
	@param arr 接收一个int类型的数组
	@return 返回最小值
	*/
	public static int getMin(int[] arr)
	{
		int min = 0;
		for (int x = 1; x < arr.length ; x++)
		{
			if ( arr[min] > arr[x] )
				min = x;
		}
		return arr[min];
	}

	/**
	给int数组进行选择排序
	@param arr 接收一个int类型的数组
	*/
	public static void selectSort(int[] arr)
	{
		for ( int x = 0 ; x < arr.length ; x++ )
		{
			for ( int y = x+1 ; y < arr.length ; y++ )
			{
				if (arr[x] > arr[y])
					trans(arr, x , y);
			}
		}
	}

	/**
	给数组两元素换位置
	@param arr 接收一个int数组
	@param a 要置换的位置角标1
	@param b 要置换的位置角标2
	*/
	private static void trans ( int[] arr, int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	/**
	打印数组元素 格式[element1, element2, ...]
	@param arr 接收一个int类型的数组
	*/
	public static void printArray( int[] arr)
	{
		System.out.print("[");
		for (int x = 0 ; x < arr.length; x++)
		{
			if ( x != arr.length-1)
				System.out.print(arr[x] + ", ");
			else
				System.out.println(arr[x] + "]");
		}
	}

}
