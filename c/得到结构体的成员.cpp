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
	pst->age = 25;// ��һ�֣�pst->age�ȼ���(*pst).age,Ҳ�ȼ���st.age
	st.score = 66.8f;// �ڶ���


	printf("%d %f %c\n",st.age, pst->score, st.sex);

	return 0;
}