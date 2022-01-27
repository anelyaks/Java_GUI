import javax.swing.*;

public class Frame extends JFrame {
    public static MainMenu menuWindow;
    public static AddBook addWindow;
    public static ListBook listWindow;
    public static UpdateBook updateWindow;
    public static DeleteBook deleteWindow;
    public static FilteredBook fListWindow;
    public Frame(){
        setSize(500,400);
        setTitle("Books");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuWindow= new MainMenu();
        setLocation(0,0);
        add(menuWindow);

        addWindow= new AddBook();
        setLocation(0,0);
        addWindow.setVisible(false);
        add(addWindow);

        listWindow= new ListBook();
        setLocation(0,0);
        listWindow.setVisible(false);
        add(listWindow);

        updateWindow= new UpdateBook();
        setLocation(0,0);
        updateWindow.setVisible(false);
        add(updateWindow);

        deleteWindow=new DeleteBook();
        setLocation(0,0);
        deleteWindow.setVisible(false);
        add(deleteWindow);

        fListWindow=new FilteredBook();
        setLocation(0,0);
        fListWindow.setVisible(false);
        add(fListWindow);

    }
}
