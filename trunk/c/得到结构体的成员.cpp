# include <stdio.h>
struct Student
{
	int age;
	float score;
	char sex;
};
int main(void)
{
	struct Student st = {24, 80.0f, 'M'};
	struct Student * pst = &st;
	pst->age = 25;// 第一种：pst->age等价于(*pst).age,也等价于st.age
	st.score = 66.8f;// 第二种


	printf("%d %f %c\n",st.age, pst->score, st.sex);

	return 0;
}