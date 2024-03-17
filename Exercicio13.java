// Exercício 3: Classificação de Idade para Montanha-russa
// Peça ao usuário para inserir sua altura e idade. Verifique se a pessoa pode andar em uma
// montanha-russa, considerando que a altura mínima é de 1,20 metros e a idade mínima
// é de 12 anos. Dentro das restrições, verifique se é "Altura insuficiente", "Idade
// insuficiente" ou "Apto".
import java.util.Scanner;

class Exercicio13 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println("Digite sua idade e sua altura:");
    int idade = input.nextInt();
    double altura = input.nextDouble();

    if (idade >= 12) {
      if (altura >= 1.20) {  
        System.out.println("Voce esta apto para andar na montanha russa");
      }else {
        System.out.println("Voce nao tem altura suficiente para andar na montanha russa");
      }
    }else {
      System.out.println("Voce nao tem idade para andar na montanha russa");
    }
  }
}