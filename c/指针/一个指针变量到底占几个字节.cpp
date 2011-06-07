# include <stdio.h>

int main(void)
{
	char c = 'A';
	int i = 10;
	double d = 20.0;
	
	char * pc = &c;
	int * pi = &i;
	double * pd = &d;

	// 各变量所占字节
	printf("%d %d %d \n",sizeof(c), sizeof(i), sizeof(d));
	// 指针变量所占字节数,都是4个字节。why?
	printf("%d %d %d \n",sizeof(pc), sizeof(pi), sizeof(pd));

	return 0;
}