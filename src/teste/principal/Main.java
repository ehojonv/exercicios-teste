package teste.principal;

import teste.exercicios.*;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao = -1;
        var menu = """
                =============================================
                Bem Vindo!
                1. Valor da variável SOMA
                2. Número pertence a sequência de Fibonacci
                3. Faturamento diário
                4. Porcetagem por estado
                5. Inverta os caracteres da string
                
                0. Sair
                Escolha o exercício para ver a resposta:""";

        while (opcao != 0) {
            System.out.println(menu);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    sairPrograma();
                    break;
                case 1:
                    resposta1();
                    break;
                case 2:
                    resposta2();
                    break;
                case 3:
                    resposta3();
                    break;
                case 4:
                    resposta4();
                    break;
                case 5:
                    resposta5();
                    break;
            }
        }
    }
    private static void sairPrograma() {
        System.out.println("Saindo...");
    }
    private static void resposta1() {
        var ex1 = new PrimeiroExercicio();
        System.out.println("O valor de SOMA é de " + ex1.resposta());
    }
    private static void resposta2() {
        var ex2 = new SegundoExercicio();
        System.out.println("Digite o número para checar:");
        if (ex2.resposta(scanner.nextInt())) {
            System.out.println("Esse número pertence a sequência");
        } else {
            System.out.println("Esse número não pertence a sequência");
        }
    }
    private static void resposta3() {
        var ex3 = new TerceiroExercicio();
        ex3.resposta();
    }
    private static void resposta4() {
        var ex4 = new QuartoExercicio();
        ex4.resposta();
    }
    private static void resposta5() {
        var ex5 = new QuintoExercicio();
        System.out.println("Digite a palavra para inverter:");
        ex5.resposta(scanner.next());
    }
}