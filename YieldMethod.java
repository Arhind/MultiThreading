/*	Yield() method
 * 	public static native void yield()
 * 	Output different for each time program get executed
 */
package multiThreading;

public class YieldMethod extends Thread{

	public void run()
	{
		for (int i = 0; i < 5; i++) {
			System.out.println(i+" : "+Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {

		YieldMethod yc = new YieldMethod();
		
		yc.start();
		Thread.yield();
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i+" : "+Thread.currentThread().getName());
		}
	}
}