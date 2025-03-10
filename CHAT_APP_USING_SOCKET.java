import java.io.*;
import java.net.*;

public class CHAT_APP_USING_SOCKET {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server started. Waiting for client...");
        Socket socket = serverSocket.accept();
        System.out.println("Client connected.");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
        String clientMessage, serverMessage;

        while (true) {
            clientMessage = in.readLine();
            if (clientMessage.equalsIgnoreCase("exit")) break;
            System.out.println("Client: " + clientMessage);

            System.out.print("Server: ");
            serverMessage = consoleInput.readLine();
            out.println(serverMessage);
        }

        socket.close();
        serverSocket.close();
    }
}