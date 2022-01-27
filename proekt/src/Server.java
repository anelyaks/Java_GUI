import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket= new ServerSocket(8080);
            while (true){
                System.out.println("waiting...");
                Socket socket= serverSocket.accept();
                System.out.println("connected");
                ServerThread serverThread= new ServerThread(socket);
                serverThread.start();
            }
        } catch (IOException e) {
                e.printStackTrace();
        }

    }
}
