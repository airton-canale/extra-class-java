class Exercicio8 {
  static public void main(String args[]) {
    int baseMaior = 10;
    int alturaMaior = 6;
    int areaMaior = 0;
    int baseMenor = 5;
    int alturaMenor = 3 ;
    int areaMenor = 0;
    int areaLivre = 0;
    int porcentagemLivre = 0;

    areaMaior = baseMaior * alturaMaior;
    areaMenor = baseMenor * alturaMenor;

    areaLivre = areaMaior - areaMenor;
    porcentagemLivre = (areaLivre * 100) / areaMaior;
    
    System.out.println("A area livre eh de:" + " " + areaLivre + "m2");
    System.out.println("A porcentagem de area livre eh de:" + " " + porcentagemLivre + "%");

  }
}