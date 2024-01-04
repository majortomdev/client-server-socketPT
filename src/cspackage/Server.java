package cspackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(8888);
			Socket soc = ss.accept();
			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			
			PrintWriter out = new PrintWriter(soc.getOutputStream(),true);//boolean sets to auto flush it,
			//not keep it in buffer until i manual flush it
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
