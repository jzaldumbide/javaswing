import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form3 {
    JPanel rootPanel;
    private JButton okButton;
    private JTextField llenarNombre;
    private JLabel textodeBievenida;

    public form3() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("probando el boton");


                textodeBievenida.setText(llenarNombre.getText());
            }
        });
    }
}
