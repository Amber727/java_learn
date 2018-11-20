class Beer
{
	private String name;
	private String baozhuang;

	Beer(String name, String baozhuang)	//构造函数
	{
		this.name = name;	//this用于区分局部变量与成员变量，this.name 表示当前变量为成员变量。成员变量是存在 在堆内存中
		qimo();
	}
	Beer(String baozhuang)
	{
		qimo();
	}

	void qimo()
	{
		System.out.println("起沫儿");
	}

	void setBaozhuang(String baozhuang)
	{
		this.baozhuang = baozhuang;
		/*
		if ( baozhuang == "听装" || baozhuang == "瓶装" )
			this.baozhuang = baozhuang;
		else
			System.out.print("没这种包装方式");
		*/
	}

	void setName(String name)
	{
		this.name = name;
	}
	
	String getName()
	{
		return name;
	}

	String getBaozhuang()
	{
		return baozhuang;
	}
}


class ThisDemo
{
	public static void main (String[] args)
	{
		//Beer beer1 = new Beer("瓶装");
		Beer beer1 = new Beer();
		beer1.setBaozhuang = "听装";
		System.out.println(beer1.getBaozhuang());
		//beer1.setBaozhuang() = "听装";
		//System.out.println(beer1.getBaozhuang());
	}
}
