# include <stdio.h>

int main(void)
{
	int * p;
	int i = 5;
	*p = i;// pָ��δ֪��Ԫ����i��ֵ��һ��δ֪���ڴ浥Ԫ����
	printf("%d", *p);
	return 0;
}