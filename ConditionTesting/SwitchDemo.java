/*
	switch语句
	x表示月份，根据x的值，判断是该月份是什么季节
*/

class SwitchDemo
{
	public static void main (String[] args)
	{
		int x = 3;
		switch(x)
		{
			case 3:
			case 4:
			case 5:
			{
				System.out.println("春天");
			}
			break;
			
			case 6:
			case 7:
			case 8:
			{
				System.out.println("夏天");
			}
			break;
			
			case 9:
			case 10:
			case 11:
			{
				System.out.println("秋天");
			}
			break;
			
			case 12:
			case 1:
			case 2:
			{
				System.out.println("冬天");
			}
			break;
			
			default:
			{
				System.out.println("Error");
			}
		}
	}
}