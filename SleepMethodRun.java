/*	sleep() method
 * 	public static native void sleep(long milli) throws InterruptedException
 * 	public static void sleep(long milli, int nano) throws InterruptedException
 * 	Each time sleep() method declared, InterruptedException should be throws
 * 	sleep() method defined in run() thread which got called from main() method 
 */

package multiThreading;

public class SleepMethodRun extends Thread{
	public void run()
	{
		for (int i = 0; i < 5; i++) {
			
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} 
			
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args){

		SleepMethodRun s = new SleepMethodRun();		
		s.start();
	}
}