# include <stdio.h>

int main()
{
	int i = 10;
	int * p = &i;
	int ** q = &p;
	int *** r = &q;// ***r = i;

	printf("%d\n", ***r);
	// 对int取地址是int *类型
	// 对指针取地址是int **类型
	return 0;
}