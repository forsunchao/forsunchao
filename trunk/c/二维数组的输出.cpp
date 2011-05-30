# include <stdio.h>

int main(void)
{
	int a[3][4] = {
		{1, 2, 3, 4},
		{5, 6, 7, 8},
		{9, 10, 11, 12}
	};

	for(int i=0; i<3; i++)
	{
		for(int j=0; j<4; j++)
		{
			printf("%-5d", a[i][j]);// -5意思是左对齐，间隔5个字符，用于控制输出格式
		}
		printf("\n");
	}
	
	return 0;
}