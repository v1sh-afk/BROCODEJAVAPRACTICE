package brocodejava;

public class SeventyEight {

	public static void main(String[] args) throws InterruptedException {
		// multithreading = process of executing multiple threads simultaneously
		// 					Helps maximum utilization of CPU
		// 					Threads are independent, they don't affect the execution of other threads
		//					An exception in one thread will not interrupt other threads
		//					useful for serving multiple clients, multiplayer games, or other mutually independent tasks
		
		//1
		//create a subclass of the thread class, create a class and make sure it extends thread class, 
		//and then you have access to the run method
		MyThread2 thread1 = new MyThread2(); 
		
		//2
		//other way to create a thread -> using subclass or class thats implementing runnable interface, 
		//create instance and pass it as an argument to the thread class 
		MyRunnable runnable1 = new MyRunnable();
		Thread thread2 = new Thread(runnable1); 
		
		//Daemon thread = background thread (non-user) JVM will not wait for daemon thread to finish
		thread1.setDaemon(true);
		thread2.setDaemon(true);
		thread1.start();
//		thread1.join(); //Main thread is going to wait until thread1 is finished and then execute thread2
//		thread1.join(3000); //Main thread will be paused for 3s before it will continue
		thread2.start();
		System.out.println(1/0);
		
	}

}
