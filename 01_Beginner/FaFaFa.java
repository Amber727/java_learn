/*
	双色球选号神器;
	（有bug，红球有可能有重复）;
*/

import java.util.Random;

class FaFaFa
{
	//取随机int整数 结果范围1~x；
	public static int getBell(int x)
	{
		Random rand = new Random();
		return rand.nextInt(x)+1;
	}
	
	
	public static void main (String[] args)
	{
		System.out.println("==========================================");
		System.out.println("本期开奖号码为：");
		System.out.println("------------------------------------------");
		
		//抽取红球；
		System.out.println("红球：");
		//红球一共取6次；
		for(int i=0;i<6;i++)
		{
			int bellNum = getBell(33);
			System.out.print(getBell(33)+"\t");		//不换行输出，后面加tab	；

		}
		System.out.println();
		
		
		//抽取蓝球；
		System.out.println("------------------------------------------");
		
		System.out.println("蓝球：");
		System.out.println(getBell(16));
		System.out.println("==========================================");
		
	}
}