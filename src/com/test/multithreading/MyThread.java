package com.test.multithreading;

public class MyThread extends Thread {

	public void run() {
		// TODO Auto-generated method stub

		printThreadedVersion();
	}


	private void printThreadedVersion() {
		System.out.println("My First Thread");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread thread = new MyThread();
		thread.start();
		thread.run("Vinod");
		
	}
	
	public void run (String name) {
		printThread(name);
	}


	private void printThread(String name) {
		System.out.println("Overloaded Run function" + name);
	}

}
