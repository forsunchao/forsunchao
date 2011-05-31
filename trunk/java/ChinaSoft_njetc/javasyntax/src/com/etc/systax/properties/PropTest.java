package com.etc.systax.properties;

import java.util.*; //Properties属于这个包
import java.io.*;
class PropTest
{
	public static void main(String[] args)
	{
		Properties pps=System.getProperties();
		pps.list(System.out);
	}
}
	
//读取配置文件中的消息
//import java.util.*;
//import java.io.*;
//class PropTest
//{
//	public static void main(String[] args)
//	{
//		/*Properties pps=System.getProperties();
//		pps.list(System.out);*/
//		
//		Properties pps=new Properties();
//		try
//		{
//			pps.load(new FileInputStream("winsun.ini"));
//			Enumeration enum=pps.propertyNames();	//枚举类
//			while(enum.hasMoreElements())
//			{
//				String strKey=(String)enum.nextElement(); //enum.nextElement()返回Object类
//				String strValue=pps.getProperty(strKey);
//				
//				System.out.println(strKey+"="+strValue);
//			}
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		
//	}
//}
