import java.awt.*;
/*
 * 创建图形化界面：
 * 1.创建frame窗体
 * 2.对窗体进行基本设置
 *		如大小、位置、布局、字体、颜色等等
 * 3.定义组件
 *		如按钮
 * 4.将组件通过add方法添加到窗体中
 * 5.让窗体显示，通过setVisible(true)
 * */
class AwtDemo
{
	public static void main(String[] args)
	{
		Frame f = new Frame("AwtDemo");
		f.setSize(500,400);	//窗口大小，宽,高
		f.setLocation(300,200);	//默认开启在左上角，顶点左边距300，上边距200
		f.setLayout(new FlowLayout());	//设置布局管理
		Button b = new Button("确认");	//创建一个按钮
		
		f.add(b);	//将按钮添加到窗口中

		f.setVisible(true);
		System.out.println("Hello world!");
	}
}
