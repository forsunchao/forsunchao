# include <stdio.h>

int main(void)
{
	int var;
	int sum = 0;
	int m = 0;
	scanf("%d", &var);

	m = var;
	// �����������㷨������̫��ע
	while(m)
	{
		sum = sum * 10 + m%10;
		m /= 10;
	}

	if(sum == var)
		printf("Yes\n");
	else
		printf("No\n");

	return 0;
}