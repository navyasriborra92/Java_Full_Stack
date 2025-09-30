package com.inner;

public class ThreadTest{
	
	public static void main(String[] args) {
		Runnable t1 = new Thread1();
		Thread t = new Thread(t1);
		t.start();
		
		Runnable t2 = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("annoy Thread1");
			}
		};
		
		Thread th = new Thread(t2);
		th.start();
		
		Runnable t3 = ()->{
			System.out.println("t3");
		};
		Thread th3 = new Thread(t3);
		th3.start();
		
		Thread th4 = new Thread(()-> System.out.println("to decrease code"));
		th4.start();
	}

}

class Thread1 implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Thread1");
	}
}
