# include <stdio.h>

void f()
{
	for(int i=0;i<5;i++)
	{
		printf("ͬ־�Ǻ�~\n");
		// break; // ��ֹѭ��
		// continue;
		return; //��ֹ����
	}
}

int main(void)
{
	f();
	
	return 0;
}