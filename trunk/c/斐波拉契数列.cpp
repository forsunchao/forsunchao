#include <stdio.h>
/*
* 1	2	3	5	8	13	21	34
* 1	2	3	4	5	6	7	8
*/

int main(void)
{
	int n;
	printf("请输入一个数：\n");
	scanf("%d", &n);
	int f1 = 1;
	int f2 = 2;
	int f3;
	if(n == 1)
	{
		f3 = 1;
	}
	else if(n == 2)
	{
		f3 = 2;
	}
	else
	{
		for(int i=3; i<=n; i++)
		{
			f3 = f2 + f1;
			f1 = f2;
			f2 = f3;	
		}
	}
	printf("f3 = %d\n", f3);
	
	return 0;
}