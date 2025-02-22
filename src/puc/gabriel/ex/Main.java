package puc.gabriel.ex;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println(" --- Menu Principal --- ");
            System.out.println("1 - Desenhar um retângulo (Ex1)");
            System.out.println("2 - Operações Aritméticas (Ex2)");
            System.out.println("3 - Calcular Nota Final (Ex3)");
            System.out.println("4 - Criptografar/Descriptografar Mensagem (Ex4/Ex5)");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    drawRectangle();
                    break;
                case 2:
                    arithmeticOperations();
                    break;
                case 3:
                    calculateFinalGrade();
                    break;
                case 4:
                    encryptionMenu();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            System.out.println();
        } while (opcao != 0);

        sc.close();
    }

    public static void drawRectangle() {
        System.out.println("Desenhar um retângulo:");
        System.out.print("Insira uma altura: ");
        int altura = sc.nextInt();
        System.out.print("Insira uma largura: ");
        int largura = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= largura; j++) {
                if (i == 1 || i == altura || j == 1 || j == largura) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Exercício 2: Menu com operações aritméticas
    public static void arithmeticOperations() {
        int opcao;
        do {
            System.out.println(" --- Menu de Operações Aritméticas --- ");
            System.out.println("1 - Somar dois números");
            System.out.println("2 - O maior de dois números");
            System.out.println("3 - Somar N números");
            System.out.println("4 - Contador de pares de uma sequência");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Escreva o primeiro número a ser somado: ");
                    int primNum = sc.nextInt();
                    System.out.print("Escreva o segundo número a ser somado: ");
                    int secNum = sc.nextInt();
                    sc.nextLine();
                    int somaTotal = primNum + secNum;
                    System.out.println("A soma dos dois números é igual a " + somaTotal);
                    break;
                case 2:
                    System.out.print("Escreva o primeiro número: ");
                    int primeiroNumMaior = sc.nextInt();
                    System.out.print("Escreva o segundo número: ");
                    int segundoNumMaior = sc.nextInt();
                    sc.nextLine();
                    int maiorNumero = (primeiroNumMaior > segundoNumMaior) ? primeiroNumMaior : segundoNumMaior;
                    System.out.println("O maior número é " + maiorNumero);
                    break;
                case 3:
                    int somaNumeros = 0;
                    List<Integer> listNum = new ArrayList<>();
                    int numDigitado;
                    System.out.println("Escreva os números que desejar somar (digite 0 para encerrar):");
                    do {
                        numDigitado = sc.nextInt();
                        listNum.add(numDigitado);
                    } while(numDigitado != 0);
                    
                    for (Integer num : listNum) {
                        somaNumeros += num;
                    }
                    System.out.println("A soma dos números " + listNum.toString() + " é igual a " + somaNumeros);
                    sc.nextLine();
                    break;
                case 4:
                    System.out.print("Quantos números terá a sequência? ");
                    int n = sc.nextInt();
                    int contadorPares = 0;
                    for (int i = 1; i <= n; i++) {
                        System.out.print("Digite o número " + i + ": ");
                        int num = sc.nextInt();
                        if (num % 2 == 0) {
                            contadorPares++;
                        }
                    }
                    sc.nextLine();
                    System.out.println("Quantidade de números pares: " + contadorPares);
                    break;
                case 0:
                    System.out.println("Voltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            System.out.println();
        } while (opcao != 0);
    }

    public static void calculateFinalGrade() {
        System.out.println("Calcular Nota Final do Aluno:");
        System.out.print("Insira a nota do Exercício 1: ");
        double notaEx1 = sc.nextDouble();
        System.out.print("Insira a nota do Exercício 2: ");
        double notaEx2 = sc.nextDouble();
        System.out.print("Insira a nota do Exercício 3: ");
        double notaEx3 = sc.nextDouble();
        System.out.print("Insira a nota do Exercício 4: ");
        double notaEx4 = sc.nextDouble();
        System.out.print("Insira a nota da Prova 1: ");
        double notaProva1 = sc.nextDouble();
        System.out.print("Insira a nota da Prova 2: ");
        double notaProva2 = sc.nextDouble();
        System.out.print("Insira a nota do Trabalho Prático: ");
        double trabPratico = sc.nextDouble();
        sc.nextLine();

        double sumNotasEx = (((notaEx1 + notaEx2 + notaEx3 + notaEx4) / 4) * 0.2);
        double sumNotasProvas = (((notaProva1 + notaProva2) / 2) * 0.6);
        double notaFinal = sumNotasEx + sumNotasProvas + trabPratico;

        System.out.printf("A nota final do aluno é %.2f%n", notaFinal);
    }

    public static void encryptionMenu() {
    	int opcao;

		do {
			System.out.println(" --- Menu: --- ");
			System.out.println("1 - Criptografar uma Mensagem");
			System.out.println("2 - Descriptografar uma Mensagem");
			System.out.println("0 - Sair");
			System.out.print("Opção: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Escreva a mensagem que deseja criptografar");
				sc.nextLine();
				String msgCriptografar = sc.nextLine();
				
				System.out.println("Mensagem criptografada: " + criptografa(msgCriptografar));
				System.out.println();
				break;
			case 2:
				System.out.println("Escreva a mensagem que deseja descriptografar");
				sc.nextLine();
				String msgDescriptografar = sc.nextLine();
				
				System.out.println("Mensagem descriptografada: " + descriptografa(msgDescriptografar));
				System.out.println();
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida! Tente novamente.");
			}
		} while (opcao != 0);
    }

    public static String criptografa(String s) {
        int colunas = 5;
        int linhas = (int) Math.ceil((double) s.length() / colunas) + 1;
        char[][] matriz = new char[linhas][colunas];

        char[] caracteres = s.toCharArray();
        int index = 0;
        for (int i = 0; i < 5 && i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (index < caracteres.length) {
                    matriz[i][j] = caracteres[index++];
                } else {
                    matriz[i][j] = ' ';
                }
            }
        }
        for (int j = 0; j < colunas; j++) {
            matriz[linhas - 1][j] = '*';
        }
        String resultado = "";
        for (int j = 0; j < colunas; j++) {
            for (int i = 0; i < linhas; i++) {
                resultado += matriz[i][j];
            }
        }
        return resultado;
    }

    public static String descriptografa(String s) {
        String semAsteriscos = s.replace("*", "");
        int colunas = 5;
        int linhas = (int) Math.ceil((double) semAsteriscos.length() / colunas);
        char[][] matriz = new char[linhas][colunas];

        int index = 0;
        for (int j = 0; j < colunas; j++) {
            for (int i = 0; i < linhas; i++) {
                if (index < semAsteriscos.length()) {
                    matriz[i][j] = semAsteriscos.charAt(index++);
                }
            }
        }
        String resultado = "";
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] != '\u0000') {
                    resultado += matriz[i][j];
                }
            }
        }
        return resultado.trim();
    }
}
