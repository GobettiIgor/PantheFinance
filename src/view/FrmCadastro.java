package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmCadastro {
    public JPanel contentPane;
    private JButton btCancelar;
    public JButton btFechar;
    private JButton btEditarCadastro;
    private JButton btNovoCadastro;

    public FrmCadastro(JFrame frame) {
        btFechar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        btNovoCadastro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frmMain = new JFrame("Cadastro");
                FrmEdtNovoCadastro frmEdtNovoCadastro = new FrmEdtNovoCadastro(frmMain);
                frmMain.setContentPane(frmEdtNovoCadastro.pnGeral);
                frmMain.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frmMain.pack();
                frmMain.setSize(768,500);
                frmMain.setLocationRelativeTo(null);
                frmMain.setVisible(true);
            }
        });
    }
}
