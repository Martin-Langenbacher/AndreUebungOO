package de.kopfBisFuss.chapter11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class SehrEinfacherChatServer {
	
	ArrayList clientAusgabeStröme;
	
	public class ClientHandler implements Runnable {
		BufferedReader reader;
		Socket sock;
		
		public ClientHandler(Socket clientSocket) {
			try {
				sock = clientSocket;
				InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
				reader = new BufferedReader(isReader);
				
			} catch (Exception ex) {
				ex.printStackTrace();
			} 
		
		} // Konstruktor schließen
		
		public void run() {
			String nachricht;
			try {
				while (( nachricht = reader.readLine()) != null ) {
					System.out.println("gelesen: " + nachricht);
					esAllenWeitersagen(nachricht);
				} // Ende der while-Schleife
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		} // run schließen
	} // innere Klasse schließen
	
	

	public static void main(String[] args) {
		new SehrEinfacherChatServer().los();
	}



	private void los() {
		clientAusgabeStröme = new ArrayList();
		
		try {
			ServerSocket serverSock = new ServerSocket(5000);
			
			while(true) {
				Socket clientSocket = serverSock.accept();
				PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
				clientAusgabeStröme.add(writer);
				Thread t = new Thread(new ClientHandler(clientSocket));
				t.start();
				System.out.println("habe eine Verbindung");
				
			}
			// wenn wir hier angelangt sind, haben wir eine Verbindung
	
		} catch (Exception ex) {
			ex.printStackTrace();
		}	
	}
	
	
	
	public void esAllenWeitersagen(String nachricht) {
		
		Iterator it = clientAusgabeStröme.iterator();
		while(it.hasNext()) {
			try {
				PrintWriter writer = (PrintWriter) it.next();
				writer.println(nachricht);
				writer.flush();
				
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		} // Ende der while-Schleife
		
	} // esAllenWeitersagen schließen

} // Klasse schließen
