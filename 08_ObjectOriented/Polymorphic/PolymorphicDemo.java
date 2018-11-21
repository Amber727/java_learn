/*
类的多态
*/

abstract class Animal
{
	abstract void eat();
	abstract void call();
}

class Cat extends Animal
{
	public void eat()
	{
		System.out.println("吃鱼");
	}

	public void call()
	{
		System.out.println("喵喵喵");
	}
}

class Dog extends Animal
{
	public void eat()
	{
		System.out.println("吃骨头");
	}

	public void call()
	{
		System.out.println("汪汪汪");
	}

	public void kanjia()		//狗的特有功能，看家
	{
		System.out.println("看家");
	}
}


class PolymorphicDemo
{
	public static void main (String[] args)
	{
		Animal c = new Cat();		//多态
		c.eat();
		c.call();

		System.out.println("-------------------------------------------------");
		Animal d = new Dog();
		d.eat();
		d.call();
		//d.kanjia();    //报错 因为动物类没有看家的功能
		
		Dog d1 = new Dog();
		d1.kanjia();
	}
}
