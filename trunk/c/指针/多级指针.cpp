# include <stdio.h>

int main()
{
	int i = 10;
	int * p = &i;
	int ** q = &p;
	int *** r = &q;// ***r = i;

	printf("%d\n", ***r);
	// ��intȡ��ַ��int *����
	// ��ָ��ȡ��ַ��int **����
	return 0;
}