package comthreading;

public class T2 extends Thread{

	T1 t1 = new T1();
	@Override
	public void run() {
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i =0; i<10; i++) {
			System.out.println("T2");
		}
	}
}
