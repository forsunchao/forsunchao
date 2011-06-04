# include <stdio.h>

void f(int * p, int len) // 此时*p就是a[0]; *(p+1)就是a[1]
{
	for(int i=0;i<len;i++)
	{
		printf("%d\n", *(p+i));
		// printf("%d\n", p[i]); //或者这样写
	}
}

int main(void)
{
	int a[5] = {1, 2, 3, 4, 5};
	f(a, 5);// a是地址
	return 0;
}