// MultiThreading
// Creation of Thread using Thread class
// Case 2 : Performing single task from multiple threads
// main is also a thread, created by JVM by default
package multiThreading;
import java.lang.Thread;

public class ThreadClassCase2 extends Thread{

	public void run()
	{
		System.out.println("1 task, 2 threads t1 and t2 created");
	}
	
	public static void main(String[] args) {			//main is also a thread, created by JVM by default, thread 3
		
		ThreadClassCase2 t1 = new ThreadClassCase2();
		ThreadClassCase2 t2 = new ThreadClassCase2();
		
		t1.start();			//Thread 1
		t2.start();			//Thread 2
	}
}