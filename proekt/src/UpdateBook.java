import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateBook extends Container {
    private JLabel wordBeforeLabel;
    private JLabel wordAfterLabel;
    private JLabel attributeLabel;

    private JTextField wordBeforeText;
    private JTextField wordAfterText;
    private String[] attributes ={"id","name","author","Genre","price","ISBN","year","publisher"};
    private JComboBox attributesBox;

    private JButton updateButton;
    private JButton listButton;
    private JButton backButton;
    public UpdateBook(){
        setSize(500,400);
        setLayout(null);
        attributeLabel=new JLabel("ATTRIBUTE");
        attributeLabel.setBounds(50,60,140,30);
        add(attributeLabel);

        attributesBox=new JComboBox(attributes);
        attributesBox.setBounds(200,60,250,30);
        add(attributesBox);

        wordBeforeLabel= new JLabel("WORD BEFORE");
        wordBeforeLabel.setBounds(50,100,140,30);
        add(wordBeforeLabel);

        wordBeforeText=new JTextField();
        wordBeforeText.setBounds(200,100,250,30);
        add(wordBeforeText);

        wordAfterLabel= new JLabel("WORD AFTER");
        wordAfterLabel.setBounds(50,140,140,30);
        add(wordAfterLabel);

        wordAfterText=new JTextField();
        wordAfterText.setBounds(200,140,250,30);
        add(wordAfterText);

        updateButton=new JButton("UPDATE");
        updateButton.setBounds(50,180,126,30);
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String before= wordBeforeText.getText();
                String after=wordAfterText.getText();
                String attribute=(String)attributesBox.getSelectedItem();
                Request request= new Request("UPDATE",attribute,before,after);
                Main.connection(request);

                wordBeforeText.setText("");
                wordAfterText.setText("");
            }
        });
        add(updateButton);

        listButton=new JButton("LIST");
        listButton.setBounds(186,180,126,30);
        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Request rq = new Request("SORTED");
                Main.connection(rq);
                Main.fr.updateWindow.setVisible(false);
                Main.fr.listWindow.setVisible(true);

            }
        });
        add(listButton);

        backButton=new JButton("BACK");
        backButton.setBounds(322,180,126,30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.fr.updateWindow.setVisible(false);
                Main.fr.menuWindow.setVisible(true);
            }
        });
        add(backButton);
    }

}
