# include <stdio.h>

// 一维数组名就是数组中第一个元素的地址
int main(void)
{
	int a[5];
	printf("%#X\n", &a[0]);// 16进制输出
	printf("%#X\n", a);
	
	return 0;
}