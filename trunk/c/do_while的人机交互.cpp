#include <stdio.h>
#include <math.h>

/*
* 一元二次方程，实现人机交互，循环输入
*/
int main(void)
{
	double a,b,c;
	double x1,x2;
	double delta;
	char ch;
	do
	{
		printf("请输入三个数：\n");
		scanf("%lf %lf %lf", &a, &b, &c);
		delta = b * b - 4 * a * c;
		if(delta > 0)
		{
			printf("有两个实数解\n");
			x1 = -b + sqrt(delta) / 2 * a;
			x2 = -b - sqrt(delta) / 2 * a;
			printf("x1 = %lf\n", x1);
			printf("x2 = %lf\n", x2);
		}
		else if (delta == 0)
		{
			printf("只有一个实数解\n");
			x1 = -b + sqrt(delta) / 2 * a;
			printf("x = %lf\n", x1);
		}
		else
		{
			printf("没有实数解\n");
		}
		printf("是否要继续输入(Y/N):");
		// 下面scanf的时候必须要一个空格，为什么？
		scanf(" %c", &ch);
	} while(ch == 'Y' || ch == 'y');
	
	return 0;
}