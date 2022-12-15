/*	join() method stopping main thread and executing child thread
 * 	Suppose t2 thread is executing, then t1.join() statement ensures that t1 is finishes before the program executes t2 thread
 * 	childThread.join() made main thread stop and child thread to execute, then main thread will execute again
 * 	childThread.join() will be written in main thread block and vice versa
 */
package multiThreading;

public class JoinMethodMainThread extends Thread{

	static Thread t2;
	
	public void run()
	{
		try {
			t2.join();
			for(int i=1; i<=5; i++)
			{
				System.out.println("Child Thread : "+ i);
				Thread.sleep(1000);	
			} 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws InterruptedException{
		
		JoinMethodMainThread t1 = new JoinMethodMainThread();
		t1.start();
		
		t2 = Thread.currentThread();
		for(int i=1; i<=5; i++)
		{
			System.out.println(Thread.currentThread().getName() +" Thread : "+ i);
			Thread.sleep(1000);	
		}
	}
}