# include <stdio.h>

int main(void)
{
	// 1. int * 连在一块，可以理解为地址型
	// 2. 地址型变量p
	// 3. 只能存放int型的地址
	// 4. double * p 则只能存放double型的地址
	int * p;
	int i = 3;
	// p = i;//error 不能把整型变量给地址型变量
	p = &i;// 把i的地址给p变量
	
	return 0;
}