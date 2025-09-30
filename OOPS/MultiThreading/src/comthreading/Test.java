package comthreading;

public class Test {
	
	public static void main(String[] args) {
		Thread1 t = new Thread1();
		String name = Thread.currentThread().getName();
		System.out.println(name);
		t.start(); //thread will be registered in thread scheduler
		Thread2  t2 = new Thread2();
//		Thread3 t3 = new Thread3();
		Runnable t3 = new Thread3();// parent reference variable loose coupling
		Thread th = new Thread(t3);
		th.start();
		t2.start();
//		Hi();
		Bye();
	}
	
	static void Hi() {
		for(int i=0; i<5; i++) {
			System.out.println("Hi");
		}
	}
	
	static void Bye() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Bye");
		}
	}

}
