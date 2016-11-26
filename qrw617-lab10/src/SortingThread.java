import java.util.Arrays;

/**
 * This class will store an array, buffer, and
 * 	the name of the array (i.e. i). It will print
 * 	the sorted unsynchronized version of the arrays
 * 	then print out both arrays sort and synchronized.
 * 
 * @author Jose Bocanegra
 */
public class SortingThread implements Runnable{

	/**
	 * This is the buffer which we will use to call
	 * 	important methods for synchronization.
	 */
	private SortingBuffer buffer;
	/**
	 * This is where we will be storing the array given.
	 */
	private int[] array;
	/**
	 * This is the id of the currently stored array.
	 */
	private int i;
	
	/**
	 * This class will retrieve the variables necessary
	 * 	for printing, sort the array, then print the array
	 * 	unsynchronized.
	 * 
	 * @param i
	 * @param array
	 * @param buffer
	 */
	public SortingThread(int i, int[] array, SortingBuffer buffer){
		this.i = i;
		this.array = array;
		this.buffer = buffer;
		Arrays.sort(array);
		for(int a : array){
			System.out.println(i + " unsynchronized " + a);
		}
	}
	
	/**
	 * This class will print the synchronized and
	 * 	sorted arrays.
	 */
	@Override
	public void run() {
		for(int a : array){
			try {
				buffer.waitUntilMinimum(i, a);
				System.out.println(i + " synchronized " + a);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		buffer.finished(i);
	}
}
