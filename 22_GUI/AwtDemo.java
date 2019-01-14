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
 *
 * 事件监听机制的特点：
 * 1.事件源
 *		awt或者swing包中的那些图形界面组件
 * 2.事件
 *		每一个事件源都有特有的对应事件和共性事件
 * 3.监听器
 *		将可以触发某一个事件的动作（不只一个动作）都已封装到了监听器中
 * 4.事件处理
 *		前三个都已被java定义好，直接获取其对象处理即可。我们要做的就说对产生的动作进行处理
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
