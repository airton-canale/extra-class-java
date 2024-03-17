// Exercício 5: Classificação de Pato
// Crie um sistema para classificar um pato. Pergunte ao usuário se o animal faz “Quack”,
// se ele fizer, pergunte se ele também anda como um pato, se ele andar como um,
// pergunte se o animal nada como um pato. Caso o animal possua todas essas
// caracterísMcas, ele é um pato. Caso o animal não possua alguma, mostre ao usuário qual
// das caracterísMcas ele não obedece.

import java.util.Scanner;
class Exercicio12 {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("Seu animal faz quack? sim ou nao");
    String isDuck = input.nextLine();
    int counter = 0;
    if (isDuck.equals("sim")) {
        System.out.println("Seu animal anda como um pato? sim ou nao");
        isDuck = input.nextLine();
        if (isDuck.equals("sim")) {
          System.out.println("Seu animal nada como um pato? sim ou nao");
          isDuck = input.nextLine();
          if (isDuck.equals("sim")) {
          System.out.println("Seu animal eh um pato!");
        } else {
          System.out.println("Seu animal nao eh um pato, pois ele nao nada como um!");
        }
        } else {
          System.out.println("Seu animal nao eh um pato, pois ele nao anda como um!");
        }
    }else {
        System.out.println("Seu animal nao eh um pato, pois ele nao faz quack!");
    }

  }
}