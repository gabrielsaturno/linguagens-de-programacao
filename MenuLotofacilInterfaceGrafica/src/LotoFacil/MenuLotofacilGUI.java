package LotoFacil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

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
                aposta1();
            }
        });

        JbuttonApostaAaZ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aposta2();
            }
        });

        JbuttonApostaParImpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aposta3();
            }
        });


    }
    private void aposta1() {
        String numAposta = JOptionPane.showInputDialog(null, "Digite um número de 0 a 100: ");
        Random random = new Random();
        int numSorteado = random.nextInt(101);
        int numApostaInt = Integer.parseInt(numAposta);
        if (numSorteado == numApostaInt) {
            JOptionPane.showMessageDialog(null, "Você ganhou R$ 1.000,00!");
        } else {
            JOptionPane.showMessageDialog(null, "Você perdeu! O número sorteado foi: " + numSorteado);
        }
    }
    private void aposta2() {
        String letraAposta = JOptionPane.showInputDialog(null, "Digite uma letra: ");
        char letraSorteada = 'G';

        if (Character.isLetter(letraAposta.charAt(0))) {
            char letraApostaMaiuscula = Character.toUpperCase(letraAposta.charAt(0));
            if (letraSorteada == letraApostaMaiuscula) {
                JOptionPane.showMessageDialog(null, "Você ganhou R$ 500,00!");
            } else {
                JOptionPane.showMessageDialog(null, "Você perdeu! A letra sorteada foi: " + letraSorteada);
            }
        }
    }
    private void aposta3() {
        String numAposta = JOptionPane.showInputDialog(null, "Digite um número: ");
        int num = Integer.parseInt(numAposta);

        if (num % 2 == 0){
            JOptionPane.showMessageDialog(null, "Você ganhou R$ 100,00!");
        } else {
            JOptionPane.showMessageDialog(null, "Você perdeu!");
        }
    }

    public static void main(String[] args) { new MenuLotofacilGUI(); }
}
