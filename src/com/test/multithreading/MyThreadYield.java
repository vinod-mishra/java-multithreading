package com.test.multithreading;

public class MyThreadYield implements Runnable{

	public static void main(String[] args) {

		MyThreadYield myThreadYield = new MyThreadYield();
		Thread th = new Thread(myThreadYield);
		th.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println("******* MAIN STARTED *******" + i + "============" + Thread.currentThread().getName());
		}

		System.out.println("******* MAIN ENDED *******===========" + Thread.currentThread().getName());
	}

	@Override
	public void run() {

		for (int i = 1; i <= 8; i++) {

			Thread.yield();
			
			System.out.println("******* RUN STARTED *******" + i + "============" + Thread.currentThread().getName());
		}
		System.out.println("******* RUN ENDED *******============" + Thread.currentThread().getName());	
	}

}
