package comthreading;

public class WaitNotify {
	
	public static void main(String[] args) {
		
		int count = 0;
		Thread4 t4 = new Thread4();
		Thread5 t5 = new Thread5();
		
		t5.start();
		synchronized(t5) {
			try {
				t5.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		t4.start();
		
		System.out.println(t5.count);
	}

}
