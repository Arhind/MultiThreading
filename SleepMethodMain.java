/*	sleep() method
 * 	Each time sleep() method declared, InterruptedException should be throws
 * 	sleep() method defined in main thread
 */
package multiThreading;

public class SleepMethodMain {

	public static void main(String[] args) throws InterruptedException {

		for (int i = 0; i < 5; i++) 
		{		
				Thread.sleep(1000);
				System.out.println(i);	
		}
	}
}