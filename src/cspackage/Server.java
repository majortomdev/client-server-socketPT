package cspackage;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		try {
			System.out.println("Waiting for client....");
			ServerSocket ss = new ServerSocket(8888);
			Socket soc = ss.accept();
			System.out.println("Connection Established");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
