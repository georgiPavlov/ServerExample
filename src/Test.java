import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by georgipavlov on 09.01.16.
 */
public class Test {
    public static void main(String[] args) {
        ServerSocket socket = null;
        try {
         socket= new ServerSocket(7777);
        }catch(IOException e){
            e.printStackTrace();
        }
        while (true){
            Socket s= null;
            try {
                s = socket.accept();
            }catch(IOException e){
                e.printStackTrace();
            }

           //new Thread(new Server(socket)).start();

        }
    }
}
