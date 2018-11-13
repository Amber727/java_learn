/*
	for循环
*/

class ForDemo
{
	public static void main (String[] args)
	{
		for(int x=0 ; x<5 ; x++)
		{
			System.out.println("x="+x);
		}
		//x变量为局部变量，当for循环结束，x内存空间将被释放；
		
		int y = 0;
		for( ;y<5;y++)
		{
			System.out.println("y="+y);
		}
		System.out.println("y还存在");
	}
}