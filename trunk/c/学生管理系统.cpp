# include <stdio.h>
# include <malloc.h>

struct Student
{
	char name[100];
	int age;
	float score;
};

int main(void)
{
	int len;
	struct Student * p;
	struct Student t;
	
	printf("������ѧ����������\n");
	printf("len = ");
	scanf("%d", &len);
	// ��̬��������
	p = (struct Student *)malloc(len * sizeof(struct Student));
	
	for(int i=0;i<len;i++)
	{
		printf("�������%d��ѧ����Ϣ��\n", i+1);
		printf("name = ");
		scanf("%s", p[i].name);// ���ﲻ��ȡ��ַ����Ϊname�������һ������
		
		printf("age = ");
		scanf("%d", &p[i].age);
		
		printf("score = ");
		scanf("%f", &p[i].score);
	}
	
	// ���շ�����С��������:ð������
	for(int m=0;m<len;m++)
	{
		for(int n=0;n<len-m-1;n++)
		{
			if(p[n].score > p[n+1].score)
			{
				t = p[n];
				p[n] = p[n+1];
				p[n+1] = t;
			}
		}
	}
	
	printf("********************ѧ����Ϣ**********************\n");
	for(int j=0;j<len;j++)
	{
		printf("��%d��ѧ����Ϣ�ǣ�\n", j+1);
		printf("name = %s  ", p[j].name);
		printf("age = %d  ", p[j].age);
		printf("score = %f  ", p[j].score);
		printf("\n");
	}
	
	return 0;
}