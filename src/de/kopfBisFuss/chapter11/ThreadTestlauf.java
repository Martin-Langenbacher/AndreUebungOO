package de.kopfBisFuss.chapter11;

public class ThreadTestlauf {

	public static void main(String[] args) {
		
		Runnable threadJob = new MeinRunnable();
		Thread meinThread = new Thread(threadJob);
		
		meinThread.start();
		
		System.out.println("zurück in main");

	}

}
