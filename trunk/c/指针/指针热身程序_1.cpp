# include <stdio.h>

int main(void)
{
	// 1. int * ����һ�飬�������Ϊ��ַ��
	// 2. ��ַ�ͱ���p
	// 3. ֻ�ܴ��int�͵ĵ�ַ
	// 4. double * p ��ֻ�ܴ��double�͵ĵ�ַ
	int * p;
	int i = 3;
	// p = i;//error ���ܰ����ͱ�������ַ�ͱ���
	p = &i;// ��i�ĵ�ַ��p����
	
	return 0;
}