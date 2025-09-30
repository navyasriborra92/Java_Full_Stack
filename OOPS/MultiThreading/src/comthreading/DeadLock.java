package comthreading;

public class DeadLock {
	
	
	public static void main(String[] args) {
		T1 t1 = new T1();
		T2 t2 = new T2();
		//Deadlock
		t1.start();
		t2.start();
	}

}
