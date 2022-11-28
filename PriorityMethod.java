/*	Priority Methods in Multithreading
 * 	getPriority() & setPriority(int priority)
 * 	IllegalArgumentException throw when priority value is Illegal like int value not between 1-10
 * 	IllegalArgumentException is a runtime exception
 * 	set priority of method, before calling start method
 */
package multiThreading;

public class PriorityMethod extends Thread{

	public void run()
	{
		System.out.println("run() priority : "+Thread.currentThread().getPriority());	//Priority inherited from parent(main) is 5
		System.out.println(Thread.currentThread().getName());		//By default name is Thread-0
	}
	public static void main(String[] args) {						// By default main() method priority is 5

		System.out.println("main() priority : "+Thread.currentThread().getPriority());	//public final int getPriority()
		
		PriorityMethod pm = new PriorityMethod();
		pm.setPriority(10);											//public final void setPriority(int p) method
		pm.start();	
	}
}