# include <stdio.h>

int main(void)
{
	int * p;
	int * q;
	int i = 3;
	p = &i;
	// *q = p;  // error ���Ͳ�һ��
	// *q = *p; // *qָ��δ֪��Ԫ
	q = p;
	printf("%d\n",q);
	return 0;
}