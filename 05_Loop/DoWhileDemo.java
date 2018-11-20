/*
	do ... while 语句
	无论条件是否为true，循环体都将会被执行一次；
*/

class DoWhileDemo
{
	public static void main (String[] args)
	{
		//do...while
		int x = 1;
		do
		{
			System.out.println("x="+x);
			x++;
		}
		while(x<0);
		
		System.out.println("-----------------------------");
		
		int y = 1;
		while(y<0)
		{
			System.out.println("y="+y);
			y++;
		}
	}
	
}
