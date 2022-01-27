import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListBook extends Container {
    public static JTextArea text;
    private JButton listButton;
    private JButton filtredListButton;
    private JButton backButton;
    private JScrollPane scrollPane;
    public ListBook(){
        setSize(500,400);
        setLayout(null);
        text= new JTextArea();
        scrollPane= new JScrollPane(text,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(50,50,400,200);
        add(scrollPane);
        listButton=new JButton("SORTED LIST");
        listButton.setBounds(95,260,150,30);
        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
             Request rq = new Request("SORTED");
             Main.connection(rq);

            }
        });
        add(listButton);
        filtredListButton=new JButton("FILTERED LIST");
        filtredListButton.setBounds(255,260,150,30);
        filtredListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.fr.listWindow.setVisible(false);
                Main.fr.fListWindow.setVisible(true);
            }
        });
        add(filtredListButton);

        backButton=new JButton("BACK");
        backButton.setBounds(210,300,80,30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                Main.fr.listWindow.setVisible(false);
                Main.fr.menuWindow.setVisible(true);
            }
        });
        add(backButton);
    }
}
