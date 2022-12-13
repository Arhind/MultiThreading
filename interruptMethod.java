/*	interrupt() method in Multithreading
 * 	interrupt() can only work when a thread is in sleep() or wait() state whether this method is called or not
 *	interrupt() method throws InterruptException
 */
package multiThreading;

public class interruptMethod extends Thread{

	public void run()
	{
		try {
			for(int i=0; i<=5; i++)
			{
				System.out.println("Child Thread : "+i);
				Thread.sleep(1000);
			}
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {

		interruptMethod t1 = new interruptMethod();
		t1.start();
		t1.interrupt();
	}
}