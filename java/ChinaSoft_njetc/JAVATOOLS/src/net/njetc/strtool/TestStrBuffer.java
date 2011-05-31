package net.njetc.strtool;

public class TestStrBuffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer strBufer=new StringBuffer("chinasoft ");
		//将字符串插入到指定下标索引前面
		System.out.println(strBufer.insert(0, "weclcome  to "));
		//将指定参数的字符串表示形式追加到序列
		//拼接字符串
		strBufer=new StringBuffer();
		strBufer.append("爱");
		strBufer.append("**");
		strBufer.append("你");
		strBufer.append("**");
		strBufer.append("一");
		strBufer.append("**");
		strBufer.append("万");
		strBufer.append("**");
		strBufer.append("年");
		strBufer.append("！");
		System.out.println(strBufer.toString());
		//移除此序列的子字符串中的字符
		System.out.println(strBufer.delete(9, 12));
		strBufer=new StringBuffer("我爱你");
		//字符串反转
		System.out.println(strBufer.reverse());
		
	} 

}
