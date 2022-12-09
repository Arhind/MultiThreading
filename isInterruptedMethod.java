/*	isInterrupted() & interrupted() method in Multithreading
 * 	isInterrupted() and interrupted() methods can only work when a thread is in sleep() or wait() state whether this method is called or not
 * 	interrupted() will change from true to false
 * 	isInterrupted() will not change status of thread from true to false or false to true
 */
package multiThreading;

public class isInterruptedMethod extends Thread{

	public void run()
	{
		System.out.println("Interrupted : "+Thread.interrupted());		//true -> false
		System.out.println("isInterrupted : "+Thread.currentThread().isInterrupted());		//false
		System.out.println("Interrupted : "+Thread.interrupted());		//false
//		Thread.currentThread().interrupt();
		try {
			for(int i=1; i<=5; i++)
			{
				Thread.sleep(1000);
				System.out.println("Child Thread : "+i);	
			}
		}	catch (Exception e){
			System.out.println("Thread Interrupted : "+e);
		}
	}
	
	public static void main(String[] args) throws Exception{

		isInterruptedMethod t1 = new isInterruptedMethod();
		t1.start();
		t1.interrupt();
	}
}