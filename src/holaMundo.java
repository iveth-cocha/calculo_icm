import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class holaMundo {
    //instancia creada por defaullt de la clase JPanel con el nombre de rootPanel
    private JPanel rootPanel;

    //instancia creada por defaullt
    private JButton OKButton;
    private JLabel Resultado;
    private JTextField numero1;
    private JTextField numero2;
    private JLabel label1;
    private JLabel label2;
    int i=0;
    double a, p;

//se creo una clase con el create listener >>luego action
    public holaMundo() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    //al hacer click en botton ok se debe hacer:
                    /*resultado.setTex("Precionaste el boton ok");*/
                /*System.out.println("holis :3");
                i++;
                Resultado.setText(Integer.toString(i));
                Resultado.setText(numero1.getText()+""+numero2.getText());
                */
                    //icm=p/(a*a)=
                    a=Double.parseDouble(numero1.getText());
                    p=Double.parseDouble(numero2.getText());


                    Resultado.setText("Su ICM ES: " + Double.toString(p/(a*a)));

                }catch ( ArithmeticException l){

                }


            }



        });
    }

    public static void main(String[] args) {
        //cuadro
        JFrame frame = new JFrame("holaMundo");
        frame.setContentPane(new holaMundo().rootPanel);
        //salir de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);
    }
}
