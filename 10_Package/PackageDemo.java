/*
 *设置 CLASSPATH=$CLASSPATH:/home/amber/java_learn/PackageDir
 *PackageDir
      |--packa
	      |--DemoA.class
	  |--packb
	      |--DemoB.class
 *import可以不用写包名 简化代码书写		  

 *编译时使用 javac -d /home/amber/java_learn/PackageDir PackageDemo.java
   -d 选项指定生成的类文件位置
*/

/*
 * jar包的使用：
 * jar命令与tar命令类似 选项几乎都一样
 *
 * 1.创建jar包：
 * cd /home/amber/java_learn/PackageDir/
 * jar cvf testjar.jar packa packb aaa 
 * mv test.jar /home/amber/java_learn/10_Package/
 *
 * 2.使用jar包：
 * 设置CLASSPATH环境变量CLASSPATH=$CLASSPATH:/home/amber/java_learn/10_Package/testjar.jar
 * 
*/

import packb.DemoB;
import aaa.bbb.ccc.PackageRecursion;
class PackageDemo
{
	public static void main(String[] args)
	{
		//由于没有import packa 所有使用该包的类需要写 包名.类名
		packa.DemoA a = new packa.DemoA();
		a.show();

		DemoB b = new DemoB();
		b.show();

		PackageRecursion p = new PackageRecursion();
		p.show();
	}
}
