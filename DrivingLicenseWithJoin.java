/*	Driving License Test
 * 	1. Medical test starts
 * 	2. Then medical test completed
 * 	3. Driving test started
 * 	4. Driving test completed
 *  5. Officer signed
 */
package multiThreading;

class MedicalTest extends Thread
{
	public void run()
	{
		try 
		{
			System.out.println("Medical started");
			Thread.sleep(1000);
			System.out.println("Medical completed");
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class DrivingTest extends Thread
{
	public void run()
	{
		try 
		{
			System.out.println("Driving started");
			Thread.sleep(1000);
			System.out.println("Driving completed");
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class OfficerSign extends Thread
{
	public void run()
	{
		try 
		{
			Thread.sleep(1000);
			System.out.println("Official signed");
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class DrivingLicenseWithJoin {
	
	public static void main(String[] args) throws InterruptedException{
		
		MedicalTest license1 = new MedicalTest();
		license1.start();
		license1.join();
		
		DrivingTest license2 = new DrivingTest();
		license2.start();
		license2.join();
		
		OfficerSign license3 = new OfficerSign();
		license3.start();
	}
}