# include <stdio.h>

/*
 *������ɻ������ܣ���ʱ������ֻ���β��е�a��b,main�в��ụ��
void swap(int a, int b)
{
	int t;
	t = a;
	a = b;
	b = t;
	return;
}
*/

// ������Ӧ��ַ��ֵ��������*p��*q������tҪ����Ϊint����
void swap2(int * p, int * q)
{
	int t;
	t = *p;
	*p = *q;
	*q = t;
}

int main(void)
{
	int a = 3;
	int b = 5;
	// swap(a,b);
	swap2(&a, &b);
	printf("a = %d, b = %d\n", a,b);
	return 0;
}
