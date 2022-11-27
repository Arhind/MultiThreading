/*	Daemon Thread
 * 	1. public final void setDaemon(boolean b)
 * 	2. public final void isDaemon()
 */
package multiThreading;

public class DaemonThread extends Thread{

	public void run()
	{
		System.out.println("Daemon Thread started");
	}
	
	public static void main(String[] args) {
		
		DaemonThread d = new DaemonThread();
		d.setDaemon(true);						//Set Daemon Thread
		d.start();								//Start Daemon thread
		System.out.println(d.isDaemon());		//Thread is daemon or not
	}
}