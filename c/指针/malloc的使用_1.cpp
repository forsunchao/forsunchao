# include <stdio.h>
# include <malloc.h>// 引入此头文件

/**
 * malloc(memory allocate): 内存分配
 */

int main(void)
{
	int i = 5;// 静态分配4个字节内存

	// 1. 只有一个形参，并且是整数类型
	// 2. 4表示请求系统为本程序分配4个字节
	// 3. malloc函数只能返回第一个字节的地址
	// 4. (int *)强制类型转换，转换成整形的地址
	// 5. 一共分配了8个字节，p占4个，malloc也占4个
	// 6. p本身所占的内存是静态的，而p所指向的内存是动态的
	int * p = (int *)malloc(4);

	*p = 5;// *p代表的就是一个int型变量，只不过分配方式跟i不同

	free(p);// 把p所指向的内存给释放掉
	printf("同志们好\n");

	return 0;
}