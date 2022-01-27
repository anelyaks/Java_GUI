import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBook extends Container {
    private JLabel nameLabel;
    private JLabel authorLabel;
    private JLabel GenreLabel;
    private JLabel priceLabel;
    private JLabel ISBNLabel;
    private JLabel yearLabel;
    private JLabel publisherLabel;


    private JTextField nameText;
    private JTextField authorText;
    private JTextField GenreText;
    private JTextField priceText;
    private JTextField ISBNText;
    private JTextField yearText;
    private JTextField publisherText;

    private JButton addButton;
    private JButton backButton;

    public  AddBook(){
    setSize(500,400);
    setLayout(null);

    nameLabel=new JLabel("NAME");
    nameLabel.setBounds(50,20,100,30);
    add(nameLabel);

    nameText= new JTextField();
    nameText.setBounds(140,20,290,30);
    add(nameText);

    authorLabel=new JLabel("AUTHOR");
    authorLabel.setBounds(50,60,100,30);
    add(authorLabel);

    authorText= new JTextField();
    authorText.setBounds(140,60,290,30);
    add(authorText);

    GenreLabel=new JLabel("GENRE");
    GenreLabel.setBounds(50,100,100,30);
    add(GenreLabel);

    GenreText= new JTextField();
    GenreText.setBounds(140,100,290,30);
    add(GenreText);

    priceLabel=new JLabel("PRICE");
    priceLabel.setBounds(50,140,100,30);
    add(priceLabel);

    priceText= new JTextField();
    priceText.setBounds(140,140,290,30);
    add(priceText);

    ISBNLabel=new JLabel("ISBN");
    ISBNLabel.setBounds(50,180,100,30);
    add(ISBNLabel);

    ISBNText= new JTextField();
    ISBNText.setBounds(140,180,290,30);
    add(ISBNText);

    yearLabel=new JLabel("YEAR");
    yearLabel.setBounds(50,220,100,30);
    add(yearLabel);

    yearText= new JTextField();
    yearText.setBounds(140,220,290,30);
    add(yearText);

    publisherLabel=new JLabel("PUBLISHER");
    publisherLabel.setBounds(50,260,100,30);
    add(publisherLabel);

    publisherText =new JTextField();
    publisherText.setBounds(140,260,290,30);
    add(publisherText);

    addButton=new JButton("ADD BOOK");
    addButton.setBounds(50,300,195,30);
    addButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             String name= nameText.getText();
             String author=authorText.getText();
             String Genre= GenreText.getText();
             Long price=Long.parseLong(priceText.getText());
             Long ISBN=Long.parseLong(ISBNText.getText());
             Integer year=Integer.parseInt(yearText.getText());
             String publisher= publisherText.getText();
             Book book= new Book(null,name,author,Genre,price,ISBN,year,publisher);

            Request request= new Request("ADD",book);
            Main.connection(request);
            nameText.setText("");
            authorText.setText("");
            GenreText.setText("");
            priceText.setText("");
            ISBNText.setText("");
            yearText.setText("");
            publisherText.setText("");

        }
    });
    add(addButton);

    backButton=new JButton("BACK");
    backButton.setBounds(255,300,195,30);
    backButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        Main.fr.addWindow.setVisible(false);
        Main.fr.menuWindow.setVisible(true);
        }
    });
    add(backButton);
    }
}
