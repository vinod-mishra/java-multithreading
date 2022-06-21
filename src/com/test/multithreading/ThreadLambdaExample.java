package com.test.multithreading;

public class ThreadLambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r = () -> {

			synchronized (args) {

				for(int i= 1; i<=7; i++) {
					System.out.println("****** ******* *******  " +i);
				}
			}

		};
		
		Thread thread1 = new Thread(r);
		Thread thread2 = new Thread(r);
		thread1.start();
		thread2.start();

	}

}
