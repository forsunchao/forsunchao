# include <stdio.h>
# include <malloc.h>

void f(int * q)
{
	*q = 100;
	free(q);// ��q��ָ��ĵ�ַ�ͷ�
}
int main(void)
{
	int * p = (int *)malloc(sizeof(int));
	*p = 10;
	printf("%d\n", *p);// 10
	f(p);
	printf("%d\n", *p);// �Ѿ��ͷţ�����ֵ

	return 0;
}