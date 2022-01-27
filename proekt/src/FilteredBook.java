import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FilteredBook extends Container {
    public static JTextArea text;
    private JButton f1listButton;
    private JButton f2ListButton;
    private JButton backButton;
    private JScrollPane scrollPane;
    public FilteredBook() {
        setSize(500, 400);
        setLayout(null);
        text = new JTextArea();
        scrollPane= new JScrollPane(text,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(50,50,400,150);
        add(scrollPane);
        f1listButton=new JButton("First Filter");
        f1listButton.setBounds(95,220,150,30);
        f1listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                Request rq = new Request("FIRSTFILTERED");
                Main.connection(rq);
            }
        });
        add(f1listButton);

        f2ListButton=new JButton("Second Filter");
        f2ListButton.setBounds(255,220,150,30);
        f2ListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                Request rq = new Request("FILTERED");
                Main.connection(rq);
            }
        });
        add(f2ListButton);

        backButton=new JButton("BACK");
        backButton.setBounds(210,260,80,30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                Main.fr.fListWindow.setVisible(false);
                Main.fr.listWindow.setVisible(true);
            }
        });
        add(backButton);


    }
}
