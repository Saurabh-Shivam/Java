package oops.threads.ByImplementingRunnable;

public class MyClass {

	public static void main(String[] args) {

        Thread t = new Thread(new Loader());
        t.start();

	/* The Thread.sleep() method pauses a Thread for a specific period of time. For example calling Thread.sleep(1000); pauses 
	 * the thread for one second. 
	 * NOTE:- Keep in mind that Thread.sleep() throws an InterruptedException, so be sure to 
	 *  surround it with a try/catch block.
	 */
	
	}
}
