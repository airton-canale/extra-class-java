// Implemente um método chamado maiorEntreTres que recebe três números
// inteiros como parâmetros e retorna o maior deles.

import java.util.Scanner;
public class Exercise2 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println("Digite 3 numeros: ");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();
    System.out.println("O maior numero entre eles eh " + maiorEntreTres(num1, num2, num3));
  }
  public static int maiorEntreTres(int num1, int num2, int num3) {
      if(num1 >= num2){
        int maiorNumero = num1;
        return maiorNumero;
      } else {
        if(num2 >= num3) {
          int maiorNumero = num2;
         return maiorNumero;
        }else {
          int maiorNumero = num3;
         return maiorNumero;
        }
      }
  }

}