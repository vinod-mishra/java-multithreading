package com.test.multithreading;

class MyThreadSleepRunnable implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println("******* RUN STARTED *******" + i + "============" + Thread.currentThread().getName());
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}

public class MyThreadSleep{
	
	public static void main (String[] args) {
		
		MyThreadSleepRunnable myThreadSleepRunnable = new MyThreadSleepRunnable();
		Thread threadA = new Thread (myThreadSleepRunnable);
		threadA.setName("Thread A");
		
		Thread threadB = new Thread (myThreadSleepRunnable);
		threadB.setName("Thread B");
		
		Thread threadC = new Thread (myThreadSleepRunnable);
		threadC.setName("Thread C");
		
		System.out.println("Starting The Thread");
		
		threadA.start();
		threadB.start();
		threadC.start();
		
	}
}
