package comthreading;

public class Thread5 extends Thread{

	int count = 0;
	@Override
	public void run() {
	
		synchronized(this) {
		for(int i = 0; i<10; i++) {
			count++;
			System.out.println("tread5");
		}
	this.notify();
	}
	}
	
}
