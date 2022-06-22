package com.test.multithreading;

public class MyThreadSyncBlock implements Runnable {

	StringBuffer sb;
	
	
	public MyThreadSyncBlock(StringBuffer sb) {
		this.sb = sb;
	}

	@Override
	public void run() {

		synchronized (this) {
		
			for(int i=1;i<=100;i++) {
				
				sb = sb.append(i);
				
				System.out.println("String ---> " +sb + "  Thread Name ---> "+Thread.currentThread().getName() );
			}
		}
	}

	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("A");
		
		MyThreadSyncBlock myThreadSyncBlock = new MyThreadSyncBlock(s);
		
		Thread t1 = new Thread(myThreadSyncBlock);
		t1.setName("Thread T1");
		Thread t2 = new Thread(myThreadSyncBlock);
		t1.setName("Thread T2");
		Thread t3 = new Thread(myThreadSyncBlock);
		t1.setName("Thread T3");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
