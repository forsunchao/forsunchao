# include <stdio.h>
# include <malloc.h>

void f(int * q)
{
	*q = 100;
	free(q);// 把q所指向的地址释放
}
int main(void)
{
	int * p = (int *)malloc(sizeof(int));
	*p = 10;
	printf("%d\n", *p);// 10
	f(p);
	printf("%d\n", *p);// 已经释放，垃圾值

	return 0;
}