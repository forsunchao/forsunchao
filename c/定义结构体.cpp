# include <stdio.h>
// ����ṹ�壬��JAVA�е��ඨ������
struct Student
{
	int age;
	float score;
	char sex;
};// �˴���Ҫð�Ž���

int main(void)
{
	struct Student st = {24, 80.0, 'M'};// ��ʼ��

	// ����������ʼ��
	struct Student st2;
	st2.age = 25;
	st2.score = 78.5;
	st2.sex = 'F';

	printf("%d %f %c\n",st.age, st.score, st.sex);
	printf("%d %f %c\n",st2.age, st2.score, st2.sex);

	return 0;
}