package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmMain {
    public JPanel panel1;
    private JButton CARButton;
    private JButton CADButton;

    public FrmMain() {
        CADButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frmMainCadastro = new JFrame("Cadastro");
                FrmCadastro frmCadastro = new FrmCadastro(frmMainCadastro);
                frmMainCadastro.setContentPane(frmCadastro.contentPane);
                frmMainCadastro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frmMainCadastro.pack();
                frmMainCadastro.setSize(768,500);
                frmMainCadastro.setLocationRelativeTo(null);
                frmMainCadastro.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frmMain = new JFrame("Panthe Finance");

        frmMain.setContentPane(new FrmMain().panel1);
        frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frmMain.setSize(1024,768);
        frmMain.setLocationRelativeTo(null);
        frmMain.setVisible(true);
    }
}
