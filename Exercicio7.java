class Exercicio7 {
  static public void main(String args[]) {
    int segundos = 3680;
    int horas = segundos / 3600;
    int resto = segundos % 3600;
    int minutos = resto / 60;
    segundos = resto - (minutos * 60);
        System.out.println( "O tempo eh:" + " " + horas + ":" + minutos + ":" + segundos);
  }
}