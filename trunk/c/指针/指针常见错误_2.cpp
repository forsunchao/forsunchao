# include <stdio.h>

int main(void)
{
	int * p;
	int * q;
	int i = 3;
	p = &i;
	// *q = p;  // error 类型不一样
	// *q = *p; // *q指向未知单元
	q = p;
	printf("%d\n",q);
	return 0;
}