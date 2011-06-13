# include <stdio.h>

// √∞≈›≈≈–ÚÀ„∑®
void sort(int * p, int len)
{
	int i,j,temp;
	for(i=0;i<len-1;i++)
	{
		for(j=0;j<len-1-i;j++)
		{
			if(p[j] > p[j+1])
			{
				temp = p[j];
				p[j] = p[j+1];
				p[j+1] = temp;
			}
		}
	}
}

int main(void)
{
	int a[10] = {24, 3, 7, 5, -4, 45, 2, 8, 10, -8};
	sort(a, 10);
	for(int i=0;i<10;i++)
	{
		printf("%d  ", a[i]);
	}
	printf("\n");

	return 0;
}