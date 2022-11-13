// MultiThreading
// Creation of Thread using Thread class
package multiThreading;
import java.lang.Thread;

public class ThreadClass extends Thread{

	@Override
	public void run()
	{
		System.out.println("Thread created using Thread class");
	}
	
	public static void main(String[] args) {

	ThreadClass mt = new ThreadClass();
	mt.start();
	}
}