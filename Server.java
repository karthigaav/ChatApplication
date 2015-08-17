import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Server {
public static void main (String args[]) 
{
	try {
		Scanner scan = new Scanner(System.in);
	ServerSocket server_sock = new ServerSocket(6013); // 6013
	
//	Socket sock = new Socket("127.0.0.1",6013);
	//InputStream in = sock.getInputStream();
	//BufferedReader bin = new BufferedReader(new InputStreamReader(in));
	
	while (true) {
		Socket client = server_sock.accept();
		// we have a connection
	
		PrintWriter pout = new PrintWriter(client.getOutputStream(), true);
		Socket sock = new Socket("127.0.0.1",6014); // 6014
		InputStream in = sock.getInputStream();
		BufferedReader bin = new BufferedReader(new InputStreamReader(in));
		String chatline;
		String message = " ";
		// write the Date to the socket
		while(!(message.equals("bye"))){
			message = scan.nextLine();
			pout.println("Server Message"+" - "+ message);
			/* read the date from the socket */
			if ( (chatline = bin.readLine()) != null)
			System.out.println(chatline);
			}
			/* close the socket and resume */
			/* listening for connections */
			client.close();
			sock.close();

		// close the socket and resume listening for more connections
		//client.close();
	}
}
catch (IOException ioe) {
		System.err.println(ioe);
}

}
}
