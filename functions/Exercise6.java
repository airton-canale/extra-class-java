// Implemente um método chamado classificaTriangulo que recebe três números
// inteiros como parâmetros, representando os lados de um triângulo. O método
// deve retornar uma string indicando o Cpo de triângulo formado (equilátero,
// isósceles ou escaleno).

import java.util.Scanner;

public class Exercise6 {

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println(
      "Digite 3 numeros para verificar qual tipo de triangulo formam: "
    );
    double lado1 = input.nextDouble();
    double lado2 = input.nextDouble();
    double lado3 = input.nextDouble();
    System.out.println(
      "O tipo do triangulo eh: " + classificaTriangulo(lado1, lado2, lado3)
    );
  }

  public static String classificaTriangulo(double l1, double l2, double l3) {
    if (l1 == l2 && l2 == l3) {
      return "Equilátero";
    } else {
      if (l1 == l2 || l2 == l3 || l1 == l3) {
        return "Isósceles";
      } else {
        return "Escaleno";
      }
    }
  }
}
