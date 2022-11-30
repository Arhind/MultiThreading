/* 	Experiment on Threads
*	1. Calling 2 start() methods of same object and check the output
*	2. Calling 2 start() methods of different objects and check the output
*	3. Calling run() method instead of start() to check the output
*	4. Calling start() and run() method together
*/
package multiThreading;

public class SleepMethodExample extends Thread {

	public void run()
	{
		for (int i = 0; i < 5; i++) {
			
		try {
				//Thread.sleep(1000, 1000);
				System.out.println(i +" : "+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
			}
	
		catch(Exception e)	{
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args)
	{
		SleepMethodExample t1 = new SleepMethodExample();
		t1.start();
		t1.run();
		
		SleepMethodExample t2 = new SleepMethodExample();
		t2.start();
		t2.run();
		
	}
}