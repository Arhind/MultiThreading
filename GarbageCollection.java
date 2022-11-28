// Garbage collection
package multiThreading;

public class GarbageCollection {

	public void finalize()		// Finalize() method called before g1, g2, g3 got garbage collected
	{
		System.out.println("Object is garbage collected");
	}
	
	public static void main(String[] args) {
	
		GarbageCollection g1 = new GarbageCollection();	
		g1 = null;											// Nulling the reference
		
		GarbageCollection g2 = new GarbageCollection();
		GarbageCollection g3 = new GarbageCollection();
		g2=null;												// Assigning reference to another reference
		g3=null;
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		System.gc();		
	}
}