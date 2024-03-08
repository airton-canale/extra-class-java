import java.util.Scanner;
//  Escreva um programa que solicite ao usuário um número inteiro
// entre 0 e 1000 e calcule a soma dos dígitos desse número. O programa deve
// uLlizar a classe Scanner para receber a entrada do usuário e exibir o resultado
// da soma na tela.
class Exercicio11 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira um numero entre 0 e 1000: ");

        int numero = scanner.nextInt();

        int primeiro = numero % 10;
        int resto = numero / 10;
        int segundo = resto % 10;
        resto = resto / 10;
        int terceiro = resto % 10;
        resto = resto / 10;
        int soma = resto + terceiro + segundo + primeiro;

        System.out.println("A soma dos numeros inseridos eh: " + soma);
    }
}