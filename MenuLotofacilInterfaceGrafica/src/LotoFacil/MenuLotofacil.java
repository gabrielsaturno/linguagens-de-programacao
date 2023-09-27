package LotoFacil;

import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
import java.lang.Character;

public class MenuLotofacil {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int opcao = -1;
        do {
            System.out.println("**********Bem vindo ao menu da Lotofácil!**********");
            System.out.println("Opção 1: Apostar de 0 a 100.");
            System.out.println("Opção 2: Apostar de A à Z.");
            System.out.println("Opção 3: Apostar Par ou Ímpar.");
            System.out.println("Opção 0: Sair");
            System.out.print("\nDigite sua opção: ");
            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao){
                    case 1:
                        int numAposta;
                        do {
                            //System.out.print("\nDigite um número de 0 a 100: ");
                            String aposta = JOptionPane.showInputDialog(null, "Digite um número de 0 a 100: ");
                            numAposta = scanner.nextInt();
                            if (numAposta < 0 || numAposta > 100)
                                System.out.println("\nNúmero inválido!");
                        } while (numAposta < 0 || numAposta > 100);
                        int numSorteado = random.nextInt(101);
                        if (numSorteado == numAposta)
                            System.out.println("\n**********Você ganhou R$ 1.000,00!**********\n");
                        else
                            System.out.println("\n**********Que pena! O número sorteado foi: " + numSorteado + "**********\n");
                        break;
                    case 2:
                        char letra = 'G';
                        char letraEscolhida;
                        System.out.print("\nDigite uma letra de A à Z: ");
                        int codigoUnicode = System.in.read();
                        scanner.nextLine();
                        letraEscolhida = (char) codigoUnicode;
                        letraEscolhida = Character.toUpperCase(letraEscolhida);
                        if(Character.isLetter(letraEscolhida)){
                            if (letraEscolhida == letra)
                                System.out.println("\n**********Você ganhou R$ 500,00!**********\n");
                            else
                                System.out.println("\n**********Que pena! A letra sorteada foi: " + letra + "**********\n");
                        } else
                            System.out.println("Aposta inválida!\n");
                        break;
                    case 3:
                        int numeroParImpar = -1;
                        System.out.print("\nDigite um número: ");
                        numeroParImpar = scanner.nextInt();
                        if (numeroParImpar % 2 == 0)
                            System.out.println("\n**********Você ganhou R$ 100,00!**********\n");
                        else
                            System.out.println("\n**********Que pena! O número digitado é impar e a premiação foi par números pares!**********\n");
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("\nOpção inválida! Digite uma opção válida: \n");
                }
            } catch (java.util.InputMismatchException e){
                System.out.println("Opção digitada inválida! Programa encerrado!");
                break;
            }
        } while (opcao != 0);
    }
}
