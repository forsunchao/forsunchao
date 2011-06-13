# include <stdio.h>

enum Week
{
	monday,tuesday,wednesday,thursday,friday,saturday,sunday
};

int main(void)
{
	enum Week day = sunday;
	printf("%d\n", day);

	return 0;
}