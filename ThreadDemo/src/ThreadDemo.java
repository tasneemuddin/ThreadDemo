/**
 * Thread class
 * */
class Thread1 extends Thread {
	
	public void run() {
		show();
	}
	
	public void show() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Thread 1");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

/**
 * Thread class
 * */
class Thread2 extends Thread {
	
	public void run() {
		show();
	}
	
	public void show() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Thread 2");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		Thread1 obj1 = new Thread1();
		Thread2 obj2 = new Thread2();
		
		obj1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		obj2.start();
	}

}

