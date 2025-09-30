package comthreading;

public class T1 extends Thread{
	
	T2 t2 = new T2();
	
	@Override
	public void run() {
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i =0; i<10; i++) {
			System.out.println("T1");
		}
	}

}
