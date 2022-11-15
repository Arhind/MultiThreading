// MultiThreading
// Creation of Thread using Thread class
// Case 3 : Performing multiple task from multiple thread
// All threads t1, t2 will start together. We don't know which thread will end first, it depends on JVM, thread scheduler and algorithms only
package multiThreading;
import java.lang.Thread;

class MyThread1 extends Thread{
	
	public void run()
	{
		System.out.println("Thread 1 performing task 1");
	}
}

class MyThread2 extends Thread{
	
	public void run()
	{
		System.out.println("Thread 2 performing task 2");
	}
}

class ThreadClassCase3 {

	public static void main(String[] args) {
		
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		
		t1.start();
		t2.start();
	}
}