class Exercicio10{
  static public void main (String args[]) {
//     Escreva um algoritmo que calcule as raízes de uma equação quadráLca
// uLlizando a fórmula de Bhaskara. Crie as variáveis necessárias para armazenar
// os valores dos coeficientes a, b e c da equação e, em seguida, calcular e exibir
// as raízes reais.
int a = 1;
int b = 8;
int c = - 9;
double delta = Math.pow(b,2) - ( 4 * a * c );
double xUm = (-b + Math.sqrt(delta))/(2 * a);
double xDois = (-b - Math.sqrt(delta))/(2 * a);
System.out.println("O x' eh:" + " " +  xUm);
System.out.println("O x'' eh:" + " " + xDois);
  }
}