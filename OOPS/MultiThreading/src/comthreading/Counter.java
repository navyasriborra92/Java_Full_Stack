package comthreading;

public class Counter {
	
	int count = 0;
	
	public synchronized void increement() {
		count++;
//		System.out.println(count);
	}

}
