package revisao;

//Questão 2: Cálculo do IMC
//A "Viva Fitness" está aprimorando seu sistema de avaliação de saúde e contratou
//você para implementar uma nova funcionalidade. Além de calcular o Índice de Massa
//Corporal (IMC), agora o sistema deve verificar se o cliente está dentro dos padrões
//saudáveis de circunferência abdominal.
//O IMC é calculado pela fórmula: IMC = peso / (altura * altura), onde o peso é em
//quilogramas e a altura é em metros.
//A circunferência abdominal é um indicador importante de risco para doenças
//cardiovasculares e diabetes. De acordo com a Organização Mundial da Saúde (OMS),
//o valor limite de circunferência abdominal é de 102 cm para homens e 88 cm para
//mulheres. Valores acima desses indicam um risco aumentado de desenvolver
//doenças metabólicas.
//Seu trabalho é escrever um programa em Java que recebe o peso (em quilogramas),
//a altura (em metros) e a circunferência abdominal (em cencmetros) de um cliente.
//O programa deve calcular o IMC e verificar se a circunferência abdominal está dentro
//dos padrões saudáveis de acordo com o sexo do cliente. Você deve criar uma função
//para receber um valor numérico de IMC e retornar uma String com a classificação.
//A classificação do IMC é:
//Abaixo do peso: IMC abaixo de 18,5
//Peso normal: IMC entre 18,5 e 24,9
//Sobrepeso: IMC entre 25 e 29,9
//Obesidade Grau I: IMC entre 30 e 34,9
//Obesidade Grau II (severa): IMC entre 35 e 39,9
//Obesidade Grau III (mórbida): IMC igual ou acima de 40
//A classificação da circunferência abdominal é:
//Para homens:
//Circunferência < 94 cm: Saudável
//94 cm <= Circunferência < 102 cm: Aumentado
//Circunferência >= 102 cm: Muito aumentado
//Para mulheres:
//Circunferência < 80 cm: Saudável
//80 cm <= Circunferência < 88 cm: Aumentado
//Circunferência >= 88 cm: Muito aumentado

import java.util.Scanner;

public class Ex2 {

  public static void main(String agrs[]) {
    Scanner input = new Scanner(System.in);
    System.out.println("Digite seu peso em quilogramas: ");
    double peso = input.nextDouble();
    System.out.println("Digite sua altura em metros: ");
    double altura = input.nextDouble();
    System.out.println(
      "Digite o valor da sua circunferência abdominal em centimetros: "
    );
    double cintura = input.nextDouble();
    input.nextLine();
    System.out.println("Digite seu sexo (M ou F): ");
    String sexo = input.nextLine();
    System.out.println(
      classificaImc(peso, altura) + classificaCintura(cintura, sexo)
    );
  }

  public static String classificaImc(double peso, double altura) {
    double imc = peso / (altura * altura);
    if (imc >= 40) {
      return "Cuidado! Você tem Obesidade Grau III (mórbida)!";
    } else {
      if (imc >= 35 && imc <= 39.9) {
        return "Cuidado! Você tem Obesidade Grau II (severa)!";
      } else {
        if (imc >= 30 && imc <= 34.9) {
          return "Cuidado! Você tem Obesidade Grau I (severa)!";
        } else {
          if (imc >= 25 && imc <= 29.9) {
            return "Cuidado! Você está com sobrepeso!";
          } else {
            if (imc >= 18.5 && imc <= 24.9) {
              return "Você está no peso normal!";
            } else {
              return "Cuidado! Você está abaixo do peso normal!";
            }
          }
        }
      }
    }
  }

  public static String classificaCintura(double circunferencia, String sexo) {
    if (sexo.equals("M")) {
      if (circunferencia >= 102) {
        return "E a circunferência de sua cintura está em nível muito aumentado!";
      } else {
        if (circunferencia < 102 && circunferencia >= 94) {
          return "E a circunferência de sua cintura está em nível aumentado!";
        } else {
          return "E a circunferência de sua cintura está em nível saudável!";
        }
      }
    } else {
      if (circunferencia >= 88) {
        return "E a circunferência de sua cintura está em nível muito aumentado!";
      } else {
        if (circunferencia < 88 && circunferencia >= 80) {
          return "E a circunferência de sua cintura está em nível aumentado!";
        } else {
          return "E a circunferência de sua cintura está em nível saudável!";
        }
      }
    }
  }
}
