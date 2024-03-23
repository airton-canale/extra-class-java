// Escreva um método chamado ehPosiCvo que recebe um número inteiro como
// parâmetro e retorna verdadeiro se o número for posiCvo e falso se for negaCvo
// ou zero.

import java.util.Scanner;
public class Exercise1 {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("Digite um numero para saber se eh positivo: ");
    int numero = input.nextInt();
    System.out.println(ehPositivo(numero));
  }

  public static boolean ehPositivo(int numero) {
    if (numero <= 0) {
      return false;
    }else {
      return true;
    }
  }
}