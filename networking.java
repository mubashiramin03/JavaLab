// Server side
import java.net.ServerSocket;
import java.net.Socket;

public class Networking{
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8000);
            System.out.println("Server started");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

        }
    }
}
