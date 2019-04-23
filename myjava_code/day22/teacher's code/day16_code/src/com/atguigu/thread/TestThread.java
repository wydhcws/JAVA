package com.atguigu.thread;

/*
 * 今天学习的是多线程的基础，后面会讲多线程高级juc。（java.util.concurrent）
 * 
 * 名字：（了解）
 * （1）程序（Program）：
 * 	 为了完成某个功能，任务而选择某种编程语言，而编写的一组指令。
 *  静态的
 * （2）进程（Process）：
 * 	是程序的一次运行。动态的
 * 
 * 	进程与进程之间是独立的，有自己独立的内存空间，这个内存空间不共享。
 *  哪怕同一个程序的两个进程之间要数据交换，通信，都是比较麻烦。
 *  进程之间的切换成本比较高。
 *  
 *  现在的操作系统都是允许多进程的，多任务操作系统。
 *  CPU同一个时间只能运行一个进程，多个进程之间就会出现轮换或者抢夺CPU的情况。
 *  
 *  进程是操作系统分配资源的最小单位。
 *  
 * （3）线程（Thread）：一个进程中的其中一条执行路径。有的时候也会把线程称为轻量级的进程。
 * 	  同一个进程中的线程，是共享该进程的一些内存（堆，方法区），如果一个进程中的多个线程要实现共享数据的话比较方便。
 *   所以使用多个线程同时完成多个任务的效率比使用多个进程完成多个任务的效率要高。
 *   因为（1）可以共享某些数据（2）切换的成本比较低。
 * 
 *   线程是CPU调度的最小单位。
 * 
 * 如果一个进程中只有一个线程的话，称为单线程程序，如果有多个线程的话，称为多线程程序。
 * 之前写Java程序时，只有一个main线程。
 * 
 * 后台还有其他的线程：GC，类加载等
 */
public class TestThread {
	public static void main(String[] args) {
		System.out.println("hello");
	}
}