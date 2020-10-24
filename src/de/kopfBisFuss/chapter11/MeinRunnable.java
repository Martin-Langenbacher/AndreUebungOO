package de.kopfBisFuss.chapter11;

public class MeinRunnable implements Runnable {

	public void run() {
		los();
	}

	private void los() {
		
		try {
			Thread.sleep(2000);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		tuNochMehr();
	}

	private void tuNochMehr() {
		System.out.println("oben auf dem Stack");
	}
	
}
