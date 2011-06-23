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
	
	printf("请输入学生的人数：\n");
	printf("len = ");
	scanf("%d", &len);
	// 动态生成数组
	p = (struct Student *)malloc(len * sizeof(struct Student));
	
	for(int i=0;i<len;i++)
	{
		printf("请输入第%d个学生信息：\n", i+1);
		printf("name = ");
		scanf("%s", p[i].name);// 这里不用取地址，因为name本身就是一个数组
		
		printf("age = ");
		scanf("%d", &p[i].age);
		
		printf("score = ");
		scanf("%f", &p[i].score);
	}
	
	// 按照分数从小到大排序:冒泡排序
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
	
	printf("********************学生信息**********************\n");
	for(int j=0;j<len;j++)
	{
		printf("第%d个学生信息是：\n", j+1);
		printf("name = %s  ", p[j].name);
		printf("age = %d  ", p[j].age);
		printf("score = %f  ", p[j].score);
		printf("\n");
	}
	
	return 0;
}