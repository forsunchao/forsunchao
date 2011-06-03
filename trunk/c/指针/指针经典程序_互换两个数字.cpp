# include <stdio.h>

/*
 *不能完成互换功能，此时互换的只是形参中的a，b,main中不会互换
void swap(int a, int b)
{
	int t;
	t = a;
	a = b;
	b = t;
	return;
}
*/

// 互换对应地址的值，即互换*p，*q，所以t要定义为int类型
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
