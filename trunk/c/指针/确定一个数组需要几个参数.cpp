# include <stdio.h>

void f(int * p, int len) // ��ʱ*p����a[0]; *(p+1)����a[1]
{
	for(int i=0;i<len;i++)
	{
		printf("%d\n", *(p+i));
		// printf("%d\n", p[i]); //��������д
	}
}

int main(void)
{
	int a[5] = {1, 2, 3, 4, 5};
	f(a, 5);// a�ǵ�ַ
	return 0;
}