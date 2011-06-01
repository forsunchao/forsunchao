# include <stdio.h>

void f()
{
	for(int i=0;i<5;i++)
	{
		printf("同志们好~\n");
		// break; // 终止循环
		// continue;
		return; //终止函数
	}
}

int main(void)
{
	f();
	
	return 0;
}