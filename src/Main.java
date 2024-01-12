import javax.swing.*;

//Juan Pablo Zaldumbide
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        JFrame frame =new JFrame("Mi primera pantalla");//creo un objeto de la clase JFrame
        frame.setContentPane(new form3().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //defino un boton para cerrar la ventana
     frame.setSize(200,200);
        frame.pack();


frame.setVisible(true);//muestro todo




    }
}