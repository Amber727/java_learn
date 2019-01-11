import java.util.*;

class CollectionDemo
{
	public static void method_1()
	{
		//创建一个集合容器，使用Collection接口的子类ArrayList
		ArrayList al1 = new ArrayList();

		//1.添加元素
		al1.add("java01");
		al1.add("java02");
		al1.add("java03");
		al1.add("java04");

		//2.获取集合的长度
		sop("al1.size(): " + al1.size());

		//3.打印集合
		sop("print al1: " + al1);

		//4.删除元素
		al1.remove("java01");
		sop("al1.remove(\"java01\"): " + al1);

		//al1.clear();	//清空所有元素
		//sop("al1.clear(): " + al1);

		//5.判断元素是否存在
		sop("al1.contains(\"java02\"): " + al1.contains("java02"));

		ArrayList al2 = new ArrayList();
		al2.add("java01");
		al2.add("java02");
		al2.add("java05");
		al2.add("java06");
	}
	
	public static void method_2()
	{
		ArrayList al1 = new ArrayList();
		al1.add("java01");
		al1.add("java02");
		al1.add("java03");
		al1.add("java04");

		ArrayList al2 = new ArrayList();
		al2.add("java01");
		al2.add("java02");
		al2.add("java05");
		al2.add("java06");

		//al1.retainAll(al2); //取两个结合的交集 al1中只保留交集部分
		//sop("al1.retainAll(al2): " + al1);	//java01 java02

		al1.removeAll(al2); //将al1中和al2相同的元素删除
		sop("al1.removeAll(al2): " + al1);	//java03 java04
	}

	public static void main(String[] args)
	{
		//method_1();
		method_2();
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
