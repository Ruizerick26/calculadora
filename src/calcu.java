import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calcu {
    private JPanel frontal;
    private JButton sinButton;
    private JButton cosButton;
    private JButton tanButton;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton DELButton;
    private JButton divbt;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton xBt;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton restabt;
    private JButton button17;
    private JButton a0Button;
    private JButton sumabt;
    private JButton ACButton;
    private JButton potenbt;
    private JButton sqrt;
    private JTextField numeros;
    private JTextField resultado;
    private float num1;
    private float num2;
    private float rest;
    private boolean decimal = false;

    public static void main(String[] args) {
        JFrame frame = new JFrame("calcu");
        frame.setContentPane(new calcu().frontal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public calcu(){
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeros.setText(numeros.getText()+"1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeros.setText(numeros.getText()+"2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeros.setText(numeros.getText()+"3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeros.setText(numeros.getText()+"4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeros.setText(numeros.getText()+"5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeros.setText(numeros.getText()+"6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeros.setText(numeros.getText()+"7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeros.setText(numeros.getText()+"8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeros.setText(numeros.getText()+"9");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeros.setText(numeros.getText()+"0");
            }
        });
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(decimal == false) {
                    decimal = true;
                    numeros.setText(numeros.getText() + ".");
                }
            }
        });
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    numeros.setText("");
            }
        });
    }
}
