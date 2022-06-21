package com.test.multithreading;

public class MyThreadRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable Thread");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThreadRunnable myThreadRunnable = new MyThreadRunnable();
		
		Thread thread = new Thread(myThreadRunnable);
		thread.start();
	}

}
