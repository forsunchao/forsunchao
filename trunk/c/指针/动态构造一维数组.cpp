# include <stdio.h>
# include <malloc.h>

int main(void)
{
	int len;
	int * p;
	printf("������Ҫ���Ԫ�صĸ���:");
	scanf("%d", &len);
	// *************************������ؼ�**********************
	p = (int *)malloc(4 * len);// ��̬����������ϣ�����Ϊp[len];
	
	for(int i=0;i<len;i++)
	{
		scanf("%d", &p[i]);
	}
	
	//  �������
	printf("һά����Ϊ��\n");
	for(int j=0;j<len;j++)
	{
		printf("%d\n", p[j]);
	}
	free(p);// �ͷŶ�̬���������
	
	printf("�ͷź�һά����Ϊ��\n");// ��ʱΪ����ֵ
	for(int k=0;k<len;k++)
	{
		printf("%d\n", p[k]);
	}

	return 0;
}