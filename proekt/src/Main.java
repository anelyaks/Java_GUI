import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static Frame fr;

    public static void connection(Request request){
        try {
            Socket socket= new Socket("127.0.0.1",8081);
            ObjectOutputStream oos=new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois=new ObjectInputStream(socket.getInputStream());

            if(request.getOperationType().equals("ADD")){
                oos.writeObject(request);
            }
            else if(request.getOperationType().equals("SORTED")){
                oos.writeObject(request);
                Request fromServer= (Request)ois.readObject();
                ArrayList<Book> dataFromServer=fromServer.getBooks();
                Collections.sort(dataFromServer, new Comparator<Book>() {
                            @Override
                            public int compare(Book o1, Book o2) {
                                return Long.compare(o2.getPrice(),o1.getPrice());
                            }
                });
                String s="";
                for(int i=0;i<dataFromServer.size();i++){
                    s+=dataFromServer.get(i)+"\n";
                }
                ListBook.text.append(s);
            }
            else if(request.getOperationType().equals("FIRSTFILTERED")) {
                ArrayList<Book> flist = new ArrayList<>();
                oos.writeObject(request);
                Request fromServer = (Request) ois.readObject();
                ArrayList<Book> dataFromServer = fromServer.getBooks();
                String s = "";
                for (int i = 0; i < dataFromServer.size(); i++) {
                    if (dataFromServer.get(i).getPublisher().equals("O'Reilly Media")&&dataFromServer.get(i).getYear()==2020) {
                        s+=dataFromServer.get(i)+"\n";

                    }
                }
                FilteredBook.text.append(s);
            }
            else if(request.getOperationType().equals("FILTERED")) {
                ArrayList<Book> flist = new ArrayList<>();
                oos.writeObject(request);
                Request fromServer = (Request) ois.readObject();
                ArrayList<Book> dataFromServer = fromServer.getBooks();
                String s = "";
                for (int i = 0; i < dataFromServer.size(); i++) {
                    if (dataFromServer.get(i).getAuthor().equals("Gabriel Garcia") && dataFromServer.get(i).getPrice()<50) {
                        s+=dataFromServer.get(i)+"\n";
                    }
                }
                FilteredBook.text.append(s);
            }
            else if(request.getOperationType().equals("UPDATE")){
                oos.writeObject(request);
            }
            else if(request.getOperationType().equals("DELETE")){
            oos.writeObject(request);
            }
            ois.close();
            oos.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
    fr=new Frame();
    fr.setVisible(true);
    }
}
