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
    private JButton igualButton;
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
        // Botones del 0 al 9
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

        // Ps lo mismo que hace el del de una calcu
        DELButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!numeros.getText().isEmpty()) {
                    String currentText = numeros.getText();
                    if (currentText.length() > 1) {
                        numeros.setText(currentText.substring(0, currentText.length() - 1));
                    } else {
                        numeros.setText("");
                    }
                }
            }
        });

        // Boton pa borrar los datos de la pantalla
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeros.setText("");
                resultado.setText("");
            }
        });

        // Funcion Suma
        sumabt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!numeros.getText().isEmpty()) {
                    num1 = Float.parseFloat(numeros.getText());
                    numeros.setText(numeros.getText() + "+");
                    decimal = false;
                }
            }
        });

        // Funcion Resta
        restabt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!numeros.getText().isEmpty()) {
                    num1 = Float.parseFloat(numeros.getText());
                    numeros.setText(numeros.getText() + " - ");
                    decimal = false;
                }
            }
        });

        // Funcion Seno
        sinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (numeros.getText().isEmpty()) {
                    numeros.setText("sin");
                }
            }
        });


        // Resultado al momento de presionar igual
        igualButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!numeros.getText().isEmpty()) {
                    String operacion = numeros.getText();
                    String[] parts;
                    // Si la operacion es Suma
                    if (operacion.contains("+")) {
                        parts = operacion.split("\\+");
                        if (parts.length == 2) {
                            num1 = Float.parseFloat(parts[0].trim());
                            num2 = Float.parseFloat(parts[1].trim());
                            float suma = num1 + num2;
                            resultado.setText(String.valueOf(suma));
                            resultado.setHorizontalAlignment(SwingConstants.RIGHT);
                            decimal = false;
                        }
                    // Si la operacion es Resta
                    } else if (operacion.contains("-")) {
                        parts = operacion.split("-");
                        if (parts.length == 2) {
                            num1 = Float.parseFloat(parts[0].trim());
                            num2 = Float.parseFloat(parts[1].trim());
                            float resta = num1 - num2;
                            resultado.setText(String.valueOf(resta));
                            resultado.setHorizontalAlignment(SwingConstants.RIGHT);
                            decimal = false;
                        }
                    // Si la operacion es Seno
                    } else if (operacion.startsWith("sin")) {
                        double angulo = Double.parseDouble(operacion.substring(3));
                        double resultadoSeno = Math.sin(Math.toRadians(angulo));
                        resultado.setText(String.valueOf(resultadoSeno));
                        resultado.setHorizontalAlignment(SwingConstants.RIGHT);
                    }
                }
            }
        });
    }
}


