# include <stdio.h>

int main(void)
{
	int a[7] = {1, 2, 3, 4, 5, 6, 7};
	int i = 0;
	int j = 6;
	int temp;
	// a[0]跟a[6]互换，a[1]跟a[5]互换，依此类推下去
	while(i < j)
	{
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		i++;
		j--;
	}
	
	for(i=0; i<7; i++)
	{
		printf("%d\n", a[i]);
	}
	
	return 0;
}