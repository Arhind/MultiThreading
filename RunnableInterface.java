// MultiThreading
// Thread creation using Runnable interface
package multiThreading;
import java.lang.Runnable;

public class RunnableInterface implements Runnable {		//Step 1

	//Override the run method
	public void run()										//Step 2
	{
		System.out.println("Thread created using Runnable interface");
	}
	
	public static void main(String[] args) {
		
		RunnableInterface r = new RunnableInterface();		//Step 3
		Thread th = new Thread(r);							//Step 4
		
		th.start(); 										//Step 5
	}
}