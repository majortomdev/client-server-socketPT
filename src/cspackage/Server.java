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
			System.out.println("Server started");
			ServerSocket ss = new ServerSocket(8888);
			System.out.println("Waiting for client...");
			Socket soc = ss.accept();
			System.out.println("Established Connection");
			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			
			PrintWriter out = new PrintWriter(soc.getOutputStream(),true);//boolean sets to auto flush it,
			//not keep it in buffer until i manual flush it
			
			while(true) {
				String strChoices[] = in.readLine().split(":");
				
				int option = Integer.parseInt(strChoices[0]);
				int num1 = Integer.parseInt(strChoices[1]);
				int num2 = Integer.parseInt(strChoices[2]);
				String result = "";
				int flag=0;
				switch(option) {
				case 1: result = "Addition is: "+(num1+num2);break;
				case 2: result = "Subtraction is: "+(num1-num2);break;
				case 3: result = "Multiplication is: "+(num1*num2);break;
				case 4: result = "Division is: "+(num1/num2);break;
				case 5: flag=1;
				default:break;
				}
				
				if(flag==1) {
					break;
				}
				
				//System.out.println(result);
				out.println(result);
			}
			
			
			
			System.out.println("Server terminated");
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
