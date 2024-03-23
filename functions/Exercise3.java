// Crie uma função chamada ehTriangulo que recebe três números inteiros como
// argumentos e verifica se eles formam os lados de um triângulo. O método deve
// retornar verdadeiro se formarem um triângulo e falso caso contrário.
import java.util.Scanner;
public class Exercise3 {
  public static void main(String args[]) {
    System.out.println("Digite 3 numeros para verificar se sao lados de um triangulo: ");
    Scanner input = new Scanner(System.in);
     int a = input.nextInt();
     int b = input.nextInt();
     int c = input.nextInt(); 
     System.out.println("Os conjuntos formam um triangulo? " + ehTriangulo(a, b, c));


  }

  public static boolean ehTriangulo(int a, int b, int c) {
    if (a > Math.abs(b - c) && a < b + c || b > Math.abs(a - c) && b < a + c || c > Math.abs(a - b) && c < a + b) {
      return true;
    } else {
      return false;
    }
  }
}