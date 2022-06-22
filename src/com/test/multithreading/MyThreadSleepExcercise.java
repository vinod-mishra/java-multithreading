package com.test.multithreading;

public class MyThreadSleepExcercise implements Runnable {

	@Override
	public void run() {

		//For loop to count numbers from 1-100
		for(int i=1; i<=100; i++) {
			
			//Determine if the current number is divisible by 10 & print it
			if (i%10 ==0) {
				System.out.println(+i);
			}
			
			// Thread.sleep (1000)
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
		
			
		    
	}

	public static void main(String[] args) {

		MyThreadSleepExcercise myThreadSleepExcercise = new MyThreadSleepExcercise();
		Thread thread = new Thread(myThreadSleepExcercise);
		thread.start();
		
	}

}
