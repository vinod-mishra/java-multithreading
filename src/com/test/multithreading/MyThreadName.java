package com.test.multithreading;

/**
 * This class prints name of the executing thread.
 * 
 * @author MAC
 * @version 1.0
 */
public class MyThreadName {

	public static void main(String[] args) {

		Runnable r = () -> {
			for (int i = 1; i <= 5; i++) {

				System.out.println("Name of the Thread >>>> " + Thread.currentThread().getName());
			}
		};

		Thread t1 = new Thread(r);
		t1.setName("Thread A");
		Thread t2 = new Thread(r);
		t2.setName("Thread B");

		t1.start();
		t2.start();

	}

}
