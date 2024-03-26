package revisao;

import java.util.Scanner;

//Questão 1: Sistema de Vendas com Descontos Progressivos
//Imagine que você está desenvolvendo um sistema de vendas para uma loja. A loja
//oferece descontos progressivos de acordo com o valor da compra. Implemente um
//programa que calcule o valor total da compra após aplicar os descontos. O desconto
//é calculado da seguinte forma:
//5% de desconto para compras acima de R$ 100  
//10% de desconto para compras acima de R$ 200
//15% de desconto para compras acima de R$ 300
//20% de desconto para compras acima de R$ 500
//Além disso, dependendo da região de encomenda, um valor fixo de frete deve ser
//adicionado ao valor final. Região Sudeste R$ 10, Centro-Oeste R$ 15, Nordeste R$ 25
//e Norte R$ 40.
//O programa deve solicitar ao usurário o valor da compra, a região de entrega e exibir
//o valor total após aplicar os descontos. O programa deve impedir que um valor
//negaPvo seja inserido, enviando uma mensagem para que o usuário tente
//novamente.

public class Ex1 {

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println("Digite o valor de sua compra: ");
    double valorCompra = input.nextDouble();
    input.nextLine();
    System.out.println(
      "Digite a região de destino de sua compra (Sudeste, Centro-Oeste, Nordeste ou Norte): "
    );
    String regiao = input.nextLine();
    double valorFinal;

    if (valorCompra <= 0) {
      System.out.println(
        "Valor digitado não pode ser negativo, tente novamente!"
      );
    } else {
      valorFinal = calculaValorComDesconto(valorCompra) + calculaFrete(regiao);
      System.out.println(
        "O valor final da compra com o frete e os descontos calculados é: " +
        valorFinal
      );
    }
  }

  public static int calculaFrete(String regiao) {
    switch (regiao) {
      case "Sudeste":
        return 10;
      case "Centro-Oeste":
        return 15;
      case "Nordeste":
        return 25;
      case "Norte":
        return 40;
      default:
        return 0;
    }
  }

  public static double calculaValorComDesconto(double valorCompra) {
    if (valorCompra > 500) {
      return valorCompra * 0.8;
    } else {
      if (valorCompra > 300) {
        return valorCompra * 0.85;
      } else {
        if (valorCompra > 200) {
          return valorCompra * 0.9;
        } else {
          if (valorCompra > 100) {
            return valorCompra * 0.95;
          } else {
            return valorCompra;
          }
        }
      }
    }
  }
}
