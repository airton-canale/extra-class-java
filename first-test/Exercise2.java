import java.util.Scanner;

class Exercise2 {

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println(
      "Digite esses dados respectivamete: Temperatura, Idade, Fumante (S ou N), Peso e Tosse (S ou N)*"
    );
    double temperatura = input.nextDouble();
    int idade = input.nextInt();
    input.nextLine();
    String fumante = input.nextLine();
    double peso = input.nextDouble();
    input.nextLine();
    String tosse = input.nextLine();

    System.out.println(
      "Você está " + classificar(temperatura, idade, fumante, peso, tosse)
    );
  }

  public static String classificar(
    double temperatura,
    int idade,
    String fumante,
    double peso,
    String tosse
  ) {
    if (temperatura < 37) {
      if (idade < 18) {
        return "Saudável!";
      } else {
        if (peso < 180.78) {
          if (tosse.equals("S")) {
            return "Doente!";
          } else {
            return "Saudável!";
          }
        } else {
          return "Doente!";
        }
      }
    } else {
      if (fumante.equals("S")) {
        return "Doente!";
      } else {
        if (tosse.equals("S")) {
          return "Doente!";
        } else {
          return "Saudável!";
        }
      }
    }
  }
}
