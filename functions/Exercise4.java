// . Crie um método chamado calculaDesconto que recebe o valor total de uma
// compra e a idade do cliente como parâmetros. O método deve retornar o valor
// do desconto a ser aplicado, de acordo com a seguinte regra: se o cliente Cver
// menos de 18 anos, o desconto é de 10%; caso contrário, não há desconto.

import java.util.Scanner;
public class Exercise4 {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("Digite sua idade e o valor da sua compra: ");
    int idade = input.nextInt();
    double valorCompra = input.nextDouble();

    System.out.println("O valor da compra eh: " + calculaDesconto(valorCompra, idade));
  }
  public static double calculaDesconto(double valorCompra, int idade){
    double desconto = 0.1;
    if (idade < 18) {
     return valorCompra - (valorCompra * desconto);
    }else {
      return valorCompra;
    }
  }
}