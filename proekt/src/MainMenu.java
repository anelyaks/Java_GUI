import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends Container {
    private JButton addButton;
    private JButton listButton;
    private JButton updateButton;
    private JButton deleteButton;
    private JButton exitButton;

    public  MainMenu(){
    setSize(500,400);
    setLayout(null);
    addButton= new JButton("ADD");
    addButton.setBounds(50,80,400,30);
    addButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Main.fr.addWindow.setVisible(true);
            Main.fr.menuWindow.setVisible(false);

        }
    });
    add(addButton);

    listButton= new JButton("LIST");
    listButton.setBounds(50,120,400,30);
    listButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        Main.fr.listWindow.setVisible(true);
        Main.fr.menuWindow.setVisible(false);

        }
    });
    add(listButton);

    updateButton= new JButton("UPDATE");
    updateButton.setBounds(50,160,400,30);
    updateButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Main.fr.updateWindow.setVisible(true);
            Main.fr.menuWindow.setVisible(false);


        }
    });
    add(updateButton);

    deleteButton= new JButton("DELETE");
    deleteButton.setBounds(50,200,400,30);
    deleteButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Main.fr.deleteWindow.setVisible(true);
            Main.fr.menuWindow.setVisible(false);
        }
    });
    add(deleteButton);

    exitButton= new JButton("EXIT");
    exitButton.setBounds(50,240,400,30);
    exitButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });
    add(exitButton);
}
}
