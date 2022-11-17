/*	Naming Methods & Basic methods of MultiThreading
 * 	1. Thread.currentThread().getName()
 * 	2. Thread.currentThread().setName(String name)
 * 	3. run() method, start() method, isAlive()
 * 	4. currentThread() -> Pointing current Thread
 */
package multiThreading;

public class NamingThread extends Thread {

	public void run()
	{
		System.out.println("New Thread");
	}
	
	public static void main(String[] args) {
	
		System.out.println("Current Thread Name : "+Thread.currentThread().getName());	//Returns Current Thread Name
		Thread.currentThread().setName("Arhind");										//Set new name for current thread
		System.out.println("Current Thread Name : "+Thread.currentThread().getName());	//Returns new name of thread
		
		NamingThread n1 = new NamingThread();
		n1.start();
		System.out.println("Current Thread Name : "+Thread.currentThread().getName()+ " Thread is Alive : " +Thread.currentThread().isAlive());
	}
}