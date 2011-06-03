# include <stdio.h>

/*
	1. p保存的i的地址，因此p指向i
	2. p不是i，i也不是p，因此修改p的值不影响i，修改i的值也不影响p
	3. *p 完全等同于i，即所有出现*p的地方都可以替换成i，所有出现i的地方都可以替换成*p
 */
int main(void)
{
	int * p;// int * 是一种指针类型
	int i = 3;
	p = &i;

	return 0;
}