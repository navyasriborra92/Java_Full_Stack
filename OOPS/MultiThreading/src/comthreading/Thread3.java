package comthreading;

public class Thread3 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i<10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("thread3");
		}
	}

}
