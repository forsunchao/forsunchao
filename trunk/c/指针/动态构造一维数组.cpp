# include <stdio.h>
# include <malloc.h>

int main(void)
{
	int len;
	int * p;
	printf("请输入要存放元素的个数:");
	scanf("%d", &len);
	// *************************此行最关键**********************
	p = (int *)malloc(4 * len);// 动态构造数组完毕，数组为p[len];
	
	for(int i=0;i<len;i++)
	{
		scanf("%d", &p[i]);
	}
	
	//  数组输出
	printf("一维数组为：\n");
	for(int j=0;j<len;j++)
	{
		printf("%d\n", p[j]);
	}
	free(p);// 释放动态分配的数组
	
	printf("释放后一维数组为：\n");// 此时为垃圾值
	for(int k=0;k<len;k++)
	{
		printf("%d\n", p[k]);
	}

	return 0;
}