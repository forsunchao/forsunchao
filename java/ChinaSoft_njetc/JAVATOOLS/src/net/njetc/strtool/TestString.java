package net.njetc.strtool;


public class TestString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����һ���ַ�������
		String  constr="chinasoft";
		//����һ���ַ�������
		String str=new String("chinasoft");
		//�Ƚ������ַ�����ֵ�Ƿ����
		System.out.println(constr.equals(str));
		//�Ƚ������ַ��Ƿ���ͬ
		System.out.println(constr==str);
		//��ȡ�ַ����ĳ���
		System.out.println("�ַ���\"chinasoft\"����Ϊ:"+str.length());
		//��ָ���ַ����������ַ����Ľ�β
		String str1="welcome to ";
		System.out.println(str1.concat(str));
		//����ָ���ַ��ڴ��ַ����е�һ�γ��ִ�������
	    str="welcome to nanjing etc";
	    System.out.println(str.indexOf("c"));
	    System.out.println(str.indexOf("to"));
	    // ���Դ��ַ����Ƿ���ָ����ǰ׺��ʼ
	    System.out.println(str.startsWith("welcome"));
	    //ʹ��Ĭ�����Ի����Ĺ��򽫴� String �е������ַ���ת��Ϊ��д
	    System.out.println(str.toUpperCase());
		//ȥ�ո�
	    str="  njetc    ";
	    System.out.println(str.trim());
	    //�и��ַ���
	    str="welcome&to&nanjing&etc";
	    String []strArray=str.split("&");
	    System.out.println(strArray.length);
		
	}

}
