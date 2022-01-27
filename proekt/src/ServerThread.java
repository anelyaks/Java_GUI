import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ServerThread extends Thread{
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }
    public void run(){
         try {
             DataBase dataBase= new DataBase();
             dataBase.connect();
             ObjectOutputStream oos=new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream ois=new ObjectInputStream(socket.getInputStream());
            Request request=null;
            while ((request=(Request)ois.readObject())!=null){
                if(request.getOperationType().equals("ADD")){
                    Book bookFromClient=request.getBook();
                    dataBase.addToDB(bookFromClient);
                }
                else if(request.getOperationType().equals("SORTED") || request.getOperationType().equals("FILTERED")||request.getOperationType().equals("FIRSTFILTERED") ){
                    ArrayList<Book> toClient=dataBase.listOfDB();
                    Request listToClient= new Request(toClient);
                    oos.writeObject(listToClient);
                }
                else if(request.getOperationType().equals("UPDATE")){
                   dataBase.update(request.getAttribute(),request.getWordBefore(),request.getWordAfter());
                }
                else if(request.getOperationType().equals("DELETE")){
                    dataBase.delete(request.getId());
                }
            }
            ois.close();
            oos.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
