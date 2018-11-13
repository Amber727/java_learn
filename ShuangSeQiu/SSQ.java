/*
	双色球选号神器;
*/

import java.util.Random;

class SSQ
{
	//取随机int整数 结果范围1~x；
	public static int getBell(int x)
	{
		Random rand = new Random();
		return rand.nextInt(x)+1;
	}

	//判断num这个元素是否在arr数组中，返回布尔值
	public static boolean hasEle(int num, int[] arr)
	{
		for( int x = 0 ; x < arr.length; x++)
		{
			if ( num == arr[x])
				return true;
		}
		return false;
	}

	//随机抽取不重复的num个红球
	public static void getRedBells(int num)
	{
		int[] arr = new int[num];
		arr[0] = getBell(33);	//先抽取一个球，直接写入，因为肯定不重复

		int x = 1;	//arr数组角标
		while( x < num )
		{
			int temp = getBell(33);
			if (hasEle(temp, arr))
				continue;
			arr[x++] = temp;
		}

		bubbleSort(arr);	//给arr数组排序，调用bubbleSort方法
		printArr(arr);

	}

	//遍历打印arr数组中的元素，打印在一行内
	public static void printArr(int[] arr)
	{
		for (int i=0; i<arr.length; i++)
		{
			if ( i == arr.length-1 )
				System.out.println(arr[i]);
			else
				System.out.print(arr[i]+"\t");
		}
	}
	//打印分割字符串
	public static void printSep(String c)
	{
		System.out.println(c+c+c+c+c+c+c+c+c+c+c+c+c+c+c+c+c+c+c+c+c);
	}

	//冒泡排序 int数组
	public static void bubbleSort(int[] arr)
	{
		for( int x = 0 ; x < arr.length; x++)
		{
			for ( int y = x+1 ; y < arr.length; y++)
			{
				if( arr[x] > arr[y] )
				{
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}
		}
	}

	public static void main (String[] args)
	{
		printSep("=+");
		System.out.println("本期开奖号码为：");
		printSep("--");
		
		//抽取6个红球；
		System.out.println("红球：");
		getRedBells(6);
		printSep("--");
	
		//抽取蓝球；
		System.out.println("蓝球：");
		System.out.println(getBell(16));
		printSep("=+");
	}
}
