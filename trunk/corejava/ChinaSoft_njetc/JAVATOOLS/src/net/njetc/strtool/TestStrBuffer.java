package net.njetc.strtool;

public class TestStrBuffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer strBufer=new StringBuffer("chinasoft ");
		//���ַ������뵽ָ���±�����ǰ��
		System.out.println(strBufer.insert(0, "weclcome  to "));
		//��ָ���������ַ�����ʾ��ʽ׷�ӵ�����
		//ƴ���ַ���
		strBufer=new StringBuffer();
		strBufer.append("��");
		strBufer.append("**");
		strBufer.append("��");
		strBufer.append("**");
		strBufer.append("һ");
		strBufer.append("**");
		strBufer.append("��");
		strBufer.append("**");
		strBufer.append("��");
		strBufer.append("��");
		System.out.println(strBufer.toString());
		//�Ƴ������е����ַ����е��ַ�
		System.out.println(strBufer.delete(9, 12));
		strBufer=new StringBuffer("�Ұ���");
		//�ַ�����ת
		System.out.println(strBufer.reverse());
		
	} 

}
