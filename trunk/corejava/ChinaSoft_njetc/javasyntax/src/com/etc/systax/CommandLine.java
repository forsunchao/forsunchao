package com.etc.systax;

public class CommandLine {
	public static void main(String args[]) {
//		for (int i = 0; i < args.length; i++)
//			System.out.println("args[" + i + "]: " + args[i]);
		
	    int len = args.length;  //获得命令行参数的个数    
	    if (len > 0)  //判断是否有命令行参数
	    {
	      //如果有，将其逐一打印到控制台
	      System.out.println(len + "个命令行参数，具体如下：");
	      for (int i = 0; i < args.length; i++)
	      {
	        System.out.println(args[i]);
	      }
	    }
	    else
	    {
	      //否则给出提示信息
	      System.out.println("您没有传递任何命令行参数。");
	    }

	}
	
}
