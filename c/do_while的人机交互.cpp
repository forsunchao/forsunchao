#include <stdio.h>
#include <math.h>

/*
* һԪ���η��̣�ʵ���˻�������ѭ������
*/
int main(void)
{
	double a,b,c;
	double x1,x2;
	double delta;
	char ch;
	do
	{
		printf("��������������\n");
		scanf("%lf %lf %lf", &a, &b, &c);
		delta = b * b - 4 * a * c;
		if(delta > 0)
		{
			printf("������ʵ����\n");
			x1 = -b + sqrt(delta) / 2 * a;
			x2 = -b - sqrt(delta) / 2 * a;
			printf("x1 = %lf\n", x1);
			printf("x2 = %lf\n", x2);
		}
		else if (delta == 0)
		{
			printf("ֻ��һ��ʵ����\n");
			x1 = -b + sqrt(delta) / 2 * a;
			printf("x = %lf\n", x1);
		}
		else
		{
			printf("û��ʵ����\n");
		}
		printf("�Ƿ�Ҫ��������(Y/N):");
		// ����scanf��ʱ�����Ҫһ���ո�Ϊʲô��
		scanf(" %c", &ch);
	} while(ch == 'Y' || ch == 'y');
	
	return 0;
}