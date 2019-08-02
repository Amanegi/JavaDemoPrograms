package threads;

class MyThread extends Thread {

	String name;
	int delay;

	public MyThread(String name, int delay) {
		super();
		this.name = name;
		this.delay = delay;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 1; i < 5; i++) {
			System.out.println("Thread " + name + " is running");
			try {
				sleep(delay);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+" is Alive? "+t.isAlive());
		}
	}

}

public class MultiThreadDemoByExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main thread is running");

		MyThread t1 = new MyThread("First", 1000);
		MyThread t2 = new MyThread("Second", 2000);
		MyThread t3 = new MyThread("Third", 3000);

		t1.start();
		t2.start();
		t3.start();

		/*try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		try {
			t1.join();
			t2.join();
			t3.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main thread ended");
		
	}

}
