# include <stdio.h>
// 定义结构体，跟JAVA中的类定义相似
struct Student
{
	int age;
	float score;
	char sex;
};// 此处需要冒号结束

int main(void)
{
	struct Student st = {24, 80.0, 'M'};// 初始化

	// 或者这样初始化
	struct Student st2;
	st2.age = 25;
	st2.score = 78.5;
	st2.sex = 'F';

	printf("%d %f %c\n",st.age, st.score, st.sex);
	printf("%d %f %c\n",st2.age, st2.score, st2.sex);

	return 0;
}