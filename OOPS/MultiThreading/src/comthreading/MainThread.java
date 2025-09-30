package comthreading;

public class MainThread {
	
	public static void main(String[] args) {
		Counter c = new Counter();
		
	Thread12 t12 = new Thread12(c);
	Thread13 t13 = new Thread13(c);
	t12.start();
	t13.start();
//	try {
//		Thread.sleep(1000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
	try {
		t12.join();
		t13.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("count"+ c.count);
	}

}

 class Thread12 extends Thread{
	 
	 Counter counter;
	 
	 public Thread12(Counter counter) {
		 this.counter = counter;
	 }

	@Override
	public void run() {
		for(int i=0; i<10000;i++) {
			counter.increement();
//			System.out.println("Tread12");
		}
	}
}
 
  class Thread13 extends Thread{

		 Counter counter;
		 
		 public Thread13(Counter counter) {
			 this.counter = counter;
		 }
		@Override
		public void run() {
			for(int i=0; i<10000;i++) {
				counter.increement();
//				System.out.println("Tread13");
			}
		}
	}
