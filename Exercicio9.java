class Exercicio9 {
  static public void main(String args[]){
    int primeiroValor = 10;
    int segundoValor = 6;
    int terceiroValor = 24;
    int maiorValor = 0;

    maiorValor = (primeiroValor + segundoValor + Math.abs(primeiroValor - segundoValor)) / 2;
    maiorValor = (maiorValor + terceiroValor + Math.abs(maiorValor - terceiroValor)) / 2;

    System.out.println(maiorValor);
  }
}