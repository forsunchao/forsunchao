# include <stdio.h>

int main(void)
{
	char c = 'A';
	int i = 10;
	double d = 20.0;
	
	char * pc = &c;
	int * pi = &i;
	double * pd = &d;

	// ��������ռ�ֽ�
	printf("%d %d %d \n",sizeof(c), sizeof(i), sizeof(d));
	// ָ�������ռ�ֽ���,����4���ֽڡ�why?
	printf("%d %d %d \n",sizeof(pc), sizeof(pi), sizeof(pd));

	return 0;
}