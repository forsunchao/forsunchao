# include <stdio.h>

int main(void)
{
	int * p;
	int i = 5;
	*p = i;// p指向未知单元，将i赋值给一个未知的内存单元变量
	printf("%d", *p);
	return 0;
}