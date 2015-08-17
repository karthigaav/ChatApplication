import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			// this could be changed to an IP name or address other than the localhost
			ServerSocket server_sock = new ServerSocket(6014);
			
			Socket sock = new Socket("127.0.0.1",6013);

			InputStream in = sock.getInputStream();
			BufferedReader bin = new BufferedReader(new InputStreamReader(in));
			while (true) {
				Socket client = server_sock.accept();
				PrintWriter pout = new PrintWriter(client.getOutputStream(), true);
				/* read the date from the socket */
				String chatline;
				String message = "";
				while(!(message.equals("bye"))){
					if ( (chatline = bin.readLine()) != null)
					System.out.println(chatline);
					/* write the Date to the socket */
					message = scan.nextLine();
					pout.println("Client Message"+" - "+ message);
					}
				client.close();
			sock.close();
		}
		}
		catch (IOException ioe) {
				System.err.println(ioe);
		}
		
	}
	}


