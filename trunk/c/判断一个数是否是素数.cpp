# include <stdio.h>

/*
* ����(prime)��
* ֻ�ܱ�һ������������
*/

void isPrime(int val)
{
	for(int i=2;i<val;i++)
	{
		if(val % i == 0)
		{
			break;
		}
	}
	if(i == val)
	{
		printf("Yes\n");
	}
	else
	{
		printf("No\n");
	}
}

int main(void)
{
	int val;
	scanf("%d", &val);
	isPrime(val);
	
	return 0;
}