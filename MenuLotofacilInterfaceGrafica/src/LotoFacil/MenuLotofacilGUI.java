package LotoFacil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuLotofacilGUI extends JFrame {

    private JPanel painel = new JPanel();
    private JButton JbuttonAposta0a100 = new JButton("Apostar de 0 a 100");
    private JButton JbuttonApostaAaZ = new JButton("Apostar de A à Z");
    private JButton JbuttonApostaParImpar = new JButton("Apostar Par ou Ímpar");
    private JLabel JlabelMensagem = new JLabel("MENU LOTOFÁCIL");

    public MenuLotofacilGUI(){
        this.setTitle("MENU LOTOFÁCIL");
        this.setSize(400,200);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        painel.setBackground(new Color(255,255,255));
        painel.add(JbuttonAposta0a100);
        painel.add(JbuttonApostaAaZ);
        painel.add(JbuttonApostaParImpar);
        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        JbuttonAposta0a100.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String aposta = JOptionPane.showInputDialog(null, "Digite um número de 0 a 100: ");
                int numAposta = Integer.parseInt(aposta);

                JOptionPane.showMessageDialog(null, numAposta);
            }
        });

        JbuttonApostaAaZ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String aposta = JOptionPane.showInputDialog(null, "Digite uma letra: ");

            }
        });

        JbuttonApostaParImpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String aposta = JOptionPane.showInputDialog(null, "Digite um número: ");

            }
        });

    }
    public static void main(String[] args) { new MenuLotofacilGUI(); }
}
