package com.etc.systax.final_p;

public class Point 
{
	final int x=1,y=1;//测试初始化化应用
	void output() 
	{
		System.out.println(x);
	}
	public static void main(String[] args) 
	{
		Point p=new Point();
		p.output();
	}
}
