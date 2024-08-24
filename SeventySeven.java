package brocodejava;

public class SeventySeven {

	public static void main(String[] args) throws InterruptedException {

		System.out.println(Thread.activeCount());
		Thread.currentThread().setName("Z3R3F");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setPriority(10); //Highest Priority
		System.out.println(Thread.currentThread().getPriority());  //Higher the number, higher the priority
		//to check if the current thread is alive
		System.out.println(Thread.currentThread().isAlive());
		for (int i=3;i>0;i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		System.out.println("You are done!");
		
		MyThread thread2 = new MyThread();
		
		System.out.println("DAEMON?");
		System.out.println(thread2.isDaemon());
		System.out.println("DAEMON?");
		thread2.setDaemon(true);
		System.out.println(thread2.isDaemon());
		
		thread2.start();
		System.out.println(thread2.isAlive());
		thread2.setName("Threadex");
		System.out.println(thread2.getName());
		
		System.out.println(thread2.getPriority()); //inherits the priority of the main thread
		thread2.setPriority(9);
		System.out.println(thread2.getPriority());
		
		System.out.println(Thread.activeCount());
	}
}
