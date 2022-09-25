package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmEdtNovoCadastro {
    private JTextField textField1;
    private JFormattedTextField formattedTextField1;
    private JTextField textField2;
    private JFormattedTextField formattedTextField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JComboBox comboBox1;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JRadioButton pessoaFísicaRadioButton;
    private JRadioButton pessoaJurídicaRadioButton;
    private JRadioButton femininoRadioButton;
    private JRadioButton masculinoRadioButton;
    private JButton salvarButton;
    private JButton fecharButton;
    public JPanel pnGeral;

    public FrmEdtNovoCadastro(JFrame frame) {
        fecharButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }
}
