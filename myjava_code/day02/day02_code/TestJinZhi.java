/*
进制：
	二进制（计算机世界中）   逢二进一   0-1
	十进制（生活中，人习惯的） 逢十进一  0-9
	八进制					  逢八进一   0-7
	十六进制				  逢十六进一  0-9 a-f

十进制	二进制	八进制	十六进制
0		0		0		0
1		1		1		1
2		10		2		2
3		11		3		3
4		100		4		4
5		101		5		5
6		110		6		6
7		111		7		7
8		1000	10		8
9		1001	11		9
10		1010	12		a （大小写都可以）
11		1011	13		b
12		1100	14		c
13		1101	15		d
14		1110	16		e
15		1111	17		f
16		10000	20		10

在程序中如何表示各种进制的数字：
二进制：数字前面加0b或0B
十进制：正常表示
八进制：数字前面加0
十六进制：数字前面加0x

十进制的25的二进制值是多少？
整数部分：除2倒取余
小数部分：乘2取整数部分


二进制到十进制如何换算？
从最右边开始依次是2的0次，1次，2次...

八进制和十六进制与二进制的关系
二进制的三位，相当于八进制的一位
二进制的四位，相当于十六进制的一位

1个字节，为什么是-128~127?
1个字节是八位

最高位是符号位，0表示正数，1表示负数
byte：
25 -> 0001 1001
-25 ->1001 1001

原码，反码，补码
正数，三码合一，原码，反码，补码都一样
负数，反码是除了符号位原码取反
	  补码是反码+1
-25 ->原码  1001 1001
	  反码	1110 0110
	  补码  1110 0111

补码计算：	  
25+(-25)	  0001 1001
            + 1110 0111
		    1  0000 0000
			
一个字节：
0000 0000  ->0
0000 0001  ->1
0111 1111  ->127  2的7次方-1
补码
1000 0001  ->		-127
					补码  	1000 0001
		反码：补码-1   		1000 0000
		原码：除符号位，取反1111 1111
1111 1111	-->  -1
		补码：1111 1111
		反码：1111 1110
		原码：1000 0001
		
1000 0000	本来 -0，但是-0浪费一种表示方式，因为-0和0	是一样，没必要用0000 0000和1000 0000两种表示方式。
 	-127 - 1 = -128
补码：1000 0001 - 0000 0001 = 1000 0000 
*/
class TestJinZhi{
	public static void main(String[] args){
		System.out.println(0b10);
		System.out.println(10);
		System.out.println(010);
		System.out.println(0x10);
	}
}