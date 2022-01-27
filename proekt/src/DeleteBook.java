import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteBook extends Container {
    private JLabel idLabel;
    private JTextField idText;

    private JButton deleteButton;
    private JButton backButton;

    public DeleteBook(){
        setSize(500,400);
        setLayout(null);
        idLabel=new JLabel("ID");
        idLabel.setBounds(50,60,80,30);
        add(idLabel);

        idText=new JTextField();
        idText.setBounds(140,60,310,30);
        add(idText);

        deleteButton=new JButton("DELETE");
        deleteButton.setBounds(50,140,195,30);
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer id=Integer.parseInt(idText.getText());
                Request request= new Request("DELETE",id);
                Main.connection(request);
                idText.setText("");
            }
        });
        add(deleteButton);

        backButton=new JButton("BACK");
        backButton.setBounds(255,140,195,30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.fr.deleteWindow.setVisible(false);
                Main.fr.menuWindow.setVisible(true);
            }
        });
        add(backButton);
    }
}
