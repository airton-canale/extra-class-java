// Escreva uma função chamada ehAnoBissexto que recebe um ano como
// parâmetro e verifica se ele é bissexto. O método deve retornar verdadeiro se o
// ano for bissexto e falso caso contrário.

import java.util.Scanner;
public class Exercise5 {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("Digite um ano: ");
    int ano = input.nextInt();
    System.out.println("O ano eh bissexto: " + ehAnoBissexto(ano));
  }

public static boolean ehAnoBissexto(int ano) {
  if (ano % 4 == 0) {
    return true;
  }else {
    return false;
  }
}

}