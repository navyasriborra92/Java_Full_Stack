package comthreading;

public class Thread1 extends Thread{
	
	@Override
	public void run() {
		Thread1 t = new Thread1();
		String name = Thread.currentThread().getName();
		System.out.println("...."+ name);
			for(int i=0; i<14; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread1");
			}
		}
	}
