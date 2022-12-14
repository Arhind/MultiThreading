/*	join() method stopping main thread and executing child thread
 * 	Suppose t2 thread is executing, then t1.join() statement ensures that t1 is finishes before the program executes t2 thread
 * 	childThread.join() made main thread stop and child thread to execute, then main thread will execute again
 * 	childThread.join() will be written in main thread block and vice versa
 */
package multiThreading;

public class JoinMethodChildThread extends Thread{

	public void run()
	{
		try {
			for(int i=1; i<=5; i++)
			{
				System.out.println("Child Thread : "+ i);
				Thread.sleep(1000);
			} 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {

		JoinMethodChildThread jm = new JoinMethodChildThread();
		jm.start();
		
		jm.join();					//Now main thread will stop and jm thread will execute, then main thread will execute again
		for(int i=1; i<=5; i++)
		{
			System.out.println(Thread.currentThread().getName() +" Thread : "+ i);
			Thread.sleep(1000);	
		}
	}
}